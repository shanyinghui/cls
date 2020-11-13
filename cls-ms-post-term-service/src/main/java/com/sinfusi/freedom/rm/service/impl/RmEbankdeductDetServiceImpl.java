package com.sinfusi.freedom.rm.service.impl;


import com.github.pagehelper.PageHelper;
import com.sinfusi.freedom.convert.ConvertUtil;
import com.sinfusi.freedom.core.config.Constants;
import com.sinfusi.freedom.core.utils.*;
import com.sinfusi.freedom.order.dao.IOmAbnormalendDao;
import com.sinfusi.freedom.order.dao.IOmOrderFinanceDao;
import com.sinfusi.freedom.order.dao.IOmOrderRetPayDao;
import com.sinfusi.freedom.param.dao.IParamDictDao;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductDetDao;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductfileDao;
import com.sinfusi.freedom.rm.dao.IRmNormalpriceDao;
import com.sinfusi.freedom.rm.dao.IRmPenaltytalZlDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductDet;
import com.sinfusi.freedom.rm.entity.RmNormalprice;
import com.sinfusi.freedom.rm.entity.RmPenaltytalZl;
import com.sinfusi.freedom.rm.example.RmNormalpriceExample;
import com.sinfusi.freedom.rm.example.RmPenaltytalZlExample;
import com.sinfusi.freedom.rm.example.RmRentplantabZlExample;
import com.sinfusi.freedom.rm.mapper.IRmEbankdeductDetMapper;
import com.sinfusi.freedom.rm.service.IOmAbnormalendService;
import com.sinfusi.freedom.rm.service.IRmEbankdeductDetService;
import com.sinfusi.freedom.rm.service.IRmRentplantabZlService;
import com.sinfusi.freedom.rm.service.dto.OmAbnormalendDTO;
import com.sinfusi.freedom.rm.service.dto.RmEbankdeductDetDTO;
import com.sinfusi.freedom.rm.service.dto.RmEbankdeductfileDTO;
import com.sinfusi.freedom.rm.service.dto.RmRentplantabZlDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
@Transactional(rollbackFor = Exception.class)
public class RmEbankdeductDetServiceImpl implements IRmEbankdeductDetService {


    Logger log = LoggerFactory.getLogger(RmEbankdeductDetServiceImpl.class);

    @Autowired
    private IRmEbankdeductfileDao iRmEbankdeductfileDao;
    @Autowired
    private IRmEbankdeductDetDao iRmEbankdeductDetDao;
    @Autowired
    private IRmEbankdeductDetMapper iRmEbankdeductDetMapper;
    @Autowired
    private IOmOrderFinanceDao iOmOrderFinanceDao;
    @Autowired
    private IOmAbnormalendDao iOmAbnormalendDao;
    @Autowired
    private IOmOrderRetPayDao iOmOrderRetPayDao;
    @Autowired
    private IParamDictDao iParamDictDao;
    @Autowired
    private ConvertUtil convertUtil;
    @Autowired
    private RmEbankdeductfileServiceImpl rmEbankdeductfileService;
    @Autowired
    private IOmAbnormalendService omAbnormalendService;
    @Autowired
    private IRmRentplantabZlService rmRentplantabZlService;
    @Autowired
    private IRmPenaltytalZlDao rmPenaltytalZlDao;
    @Autowired
    private IRmNormalpriceDao rmNormalpriceDao;



    /* 保存网银划扣文件表
     * @param rmEbankdeductDets
     * @return 网银划扣文件表
     */
    @Override
    public Map createAllRmEbankDeductFile(String retamtType, String custClassId, String bankType) throws Exception {
        // custClassId + bankType 参数扩增后同步更新 RmRentplantabZlService.rmEbankWaterDetService()方法
        /*bpmRedisKeyUtil.commonLock("ebank_deduct"+custClassId+bankType,"ebank_deduct");
        if(!isLock){
            throw new BusinessException("正在生成划扣文件,请稍后在操作...");
        }*/
        Map dataMap = new HashMap();
        String message = "";
        RmEbankdeductfileDTO rmEbankdeductfileDTO = new RmEbankdeductfileDTO();
        List<RmEbankdeductDet> rmEbankdeductDets = null;
        String fileUrl = "";
        // 对用户所选数据生成Excle表
        // _checked为前台页面是否选择全部导出
        try {
            Map map =  exportAllRmEbankdeductDet(retamtType,custClassId,bankType);
            fileUrl = (String) map.get("fileUrl");
            rmEbankdeductDets = (List<RmEbankdeductDet>) map.get("rmEbankdeductDets");

            // 生成id
            rmEbankdeductfileDTO.setId(GenratorUtil.getGenerator("ZJLS"));
            // 制作文件路径
            rmEbankdeductfileDTO.setMakeFilePath(fileUrl);
            // 制作文件名字
            rmEbankdeductfileDTO.setMakeFileName( fileUrl.substring(fileUrl.lastIndexOf('\\') + 1));
            // 报盘日期
            Date date = new Date();
            Instant instant = date.toInstant();
            ZoneId zoneId = ZoneId.systemDefault();
            // atZone()方法返回在指定时区从此Instant生成的ZonedDateTime。
            LocalDateTime localDate = instant.atZone(zoneId).toLocalDateTime();
            rmEbankdeductfileDTO.setMakeTime(localDate);

            // 报盘租金金额
            BigDecimal sumMakeAmt = new BigDecimal(0);
            for (RmEbankdeductDet rmEbankdeductDetDTO : rmEbankdeductDets) {
                sumMakeAmt  =  sumMakeAmt.add(rmEbankdeductDetDTO.getPayAmt());
                // 因为relId为租金或罚息或者名义价款计划表（租赁）的id  根据id更新 将是否还款中 状态改成是
                if("租金".equals(rmEbankdeductDetDTO.getRetamtTypeId())){
                    RmRentplantabZlExample rmRentplantabZlExample = new RmRentplantabZlExample();
                    rmRentplantabZlExample.createCriteria().andIdEqualTo(rmEbankdeductDetDTO.getRelId());
                    List<RmRentplantabZlDTO> rmRentplantabZlDTOs = rmRentplantabZlService.selectByExample(rmRentplantabZlExample);
                    RmRentplantabZlDTO  rmRentplantabZlDTO = rmRentplantabZlDTOs.get(0);
                    if(rmRentplantabZlDTO != null){
                        rmRentplantabZlDTO.setIsPayId("10001000");
                        rmEbankdeductfileDTO.setCostTypeId("11133001");
                        rmRentplantabZlService.createOrUpdate(rmRentplantabZlDTO); // 更新状态
                    }
                }else if("罚息".equals(rmEbankdeductDetDTO.getRetamtTypeId())){
                    RmPenaltytalZlExample rmRentplantabZlExample = new RmPenaltytalZlExample();
                    rmRentplantabZlExample.createCriteria().andIdEqualTo(rmEbankdeductDetDTO.getRelId());
                    List<RmPenaltytalZl> rmPenaltytalZls = rmPenaltytalZlDao.selectByExample(rmRentplantabZlExample);
                    RmPenaltytalZl rmPenaltytalZl =  rmPenaltytalZlDao.selectById(rmPenaltytalZls.get(0).getId());
                    if(rmPenaltytalZl != null){
                        rmPenaltytalZl.setIsPayId("10001000");
                        rmEbankdeductfileDTO.setCostTypeId("11133002");
                        rmPenaltytalZlDao.createOrUpdate(rmPenaltytalZl); // 更新状态
                    }
                }else if("名义价款".equals(rmEbankdeductDetDTO.getRetamtTypeId())){
                    RmNormalpriceExample rmRentplantabZlExample = new RmNormalpriceExample();
                    rmRentplantabZlExample.createCriteria().andIdEqualTo(rmEbankdeductDetDTO.getRelId());
                    List<RmNormalprice> rmNormalprices = rmNormalpriceDao.selectByExample(rmRentplantabZlExample);
                    RmNormalprice rmNormalprice = rmNormalprices.get(0);
                    if(rmNormalprice != null){
                        rmNormalprice.setIsPayId("10001000");
                        rmEbankdeductfileDTO.setCostTypeId("11133003");
                        rmNormalpriceDao.createOrUpdate(rmNormalprice); // 更新状态
                    }
                }else if("结清款".equals(rmEbankdeductDetDTO.getRetamtTypeId())){
                    OmAbnormalendDTO omAbnormalend =  omAbnormalendService.findOne(rmEbankdeductDetDTO.getRelId());
                    if(omAbnormalend != null){
                        omAbnormalend.setIsPayId("10001000");
                        omAbnormalend.setDeductStatusId("11518002");
                        rmEbankdeductfileDTO.setCostTypeId("11133004");
                        omAbnormalendService.createOrUpdate(omAbnormalend); // 更新状态
                    }
                }
            }
            rmEbankdeductfileDTO.setMakeAmt(sumMakeAmt);
            // 报盘租金笔数
            rmEbankdeductfileDTO.setMakeCount(rmEbankdeductDets.size());
            // 报盘文件状态
            rmEbankdeductfileDTO.setDataStateId("11136001"); // 未下载
            //  制作人 获取当前登陆人
            rmEbankdeductfileDTO.setMaker(SecurityUtils.getCurrentUsername());
            // 客户类型 // 自然人还是法人
            if("11023001".equals(custClassId)){
                rmEbankdeductfileDTO.setCustClassId(custClassId);
            }else if("11023002".equals(custClassId)){
                rmEbankdeductfileDTO.setCustClassId(custClassId);
            }else{
                log.debug("客户类型不存在");
            }
            // 银行名称
            if("02001".equals(bankType)){
                rmEbankdeductfileDTO.setEbankName("工商银行");
            }else if("02004".equals(bankType)){
                rmEbankdeductfileDTO.setEbankName("建设银行");
            }else if("02008".equals(bankType)){
                rmEbankdeductfileDTO.setEbankName("农业银行");
            }
            rmEbankdeductfileDTO.setStateId("10000000");
            // 保存网银划扣文件表
            rmEbankdeductfileDTO = rmEbankdeductfileService.save(rmEbankdeductfileDTO);
            message = "200";

        } catch (Exception e) {
            message = "500";
            e.printStackTrace();
        }finally {
            //bpmlock.commonUnlock("ebank_deduct"+custClassId+bankType,"ebank_deduct");
        }
        dataMap.put("success",message);
        return dataMap;
    }

    public Map<String,Object> exportAllRmEbankdeductDet(String retamtTypeId, String custClassId,String bankType) throws Exception {
        log.debug("REST请求导出全部明细数据: {}");
        List<ExcelExportUtil.CellMap> cellMapList = new ArrayList<ExcelExportUtil.CellMap>();

        if("02001".equals(bankType)&&("11023001".equals(custClassId))){
            cellMapList.add(new ExcelExportUtil.CellMap("序号", "","rowNumber"));
            cellMapList.add(new ExcelExportUtil.CellMap("来源系统", "SourceSystem",""));
            cellMapList.add(new ExcelExportUtil.CellMap("划扣银行", "payBankName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("划扣类型", "deduct_type_id",""));
            cellMapList.add(new ExcelExportUtil.CellMap("二级品牌名称", "brand_name",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付方是否本行账号", "",""));
            cellMapList.add(new ExcelExportUtil.CellMap("二级品牌编码", "brand_code_id",""));
            cellMapList.add(new ExcelExportUtil.CellMap("融资租赁合同号", "contractId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("经销商名称", "agent_name",""));
            cellMapList.add(new ExcelExportUtil.CellMap("经销商编码", "agent_code_id",""));
            cellMapList.add(new ExcelExportUtil.CellMap("客户名称", "cust_name",""));
            cellMapList.add(new ExcelExportUtil.CellMap("客户编码", "cust_type_id",""));
            cellMapList.add(new ExcelExportUtil.CellMap("身份证号/组织机构代码证号", "idCard",""));
            cellMapList.add(new ExcelExportUtil.CellMap("币种", "currency",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付方开户行名", "payBank",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付方卡号", "payAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("缴费编号", "payNumber",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付方户名", "payName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款单位开户行名", "recBank",""));
            cellMapList.add(new ExcelExportUtil.CellMap("省份", "province",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款方地区名", "areaName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("销售模式", "sale_type_name",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款方地区代码", "areaCode",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号", "recAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("协议编号/农行合约号", "dealNo",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款单位名称", "recUnit",""));
            cellMapList.add(new ExcelExportUtil.CellMap("款项用途", "useType",""));
            cellMapList.add(new ExcelExportUtil.CellMap("款项类型名称", "retamtTypeName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("款项类型编码", "retamtTypeId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("业务类型名称", "buss_type_id",""));
            cellMapList.add(new ExcelExportUtil.CellMap("业务类型编码", "buss_type_name",""));
            cellMapList.add(new ExcelExportUtil.CellMap("备注", "remark",""));
            cellMapList.add(new ExcelExportUtil.CellMap("预约付款日期", "",""));
            cellMapList.add(new ExcelExportUtil.CellMap("汇款方式", "","number"));
            cellMapList.add(new ExcelExportUtil.CellMap("付款账户短信通知手机号码", "telNumber",""));
            cellMapList.add(new ExcelExportUtil.CellMap("结算日", "",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义序号", "relId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("应扣金额", "payAmt","number"));





            cellMapList.add(new ExcelExportUtil.CellMap("收款方地区代码", "areaCode",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号", "recAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("协议编号", "dealNo",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款单位名称", "recUnit",""));
            cellMapList.add(new ExcelExportUtil.CellMap("备注", "remark",""));

            cellMapList.add(new ExcelExportUtil.CellMap("自定义序号", "relId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("是否工行账号", "icbcId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付方账号开户行行号", "payBankNo",""));

        }else if("02004".equals(bankType)&&("11023001".equals(custClassId))){ // 建行
            cellMapList.add(new ExcelExportUtil.CellMap("序号", "","rowNumber"));
            cellMapList.add(new ExcelExportUtil.CellMap("收款企业账号", "recAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款企业账户名称", "recName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付款方账号", "payAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付款方账户名称", "PayName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付款方开户行名称", "payCCBBank",""));
            cellMapList.add(new ExcelExportUtil.CellMap("客户方流水号", "lsh",""));
            cellMapList.add(new ExcelExportUtil.CellMap("金额（元）", "payAmt","number"));
            cellMapList.add(new ExcelExportUtil.CellMap("用途", "relId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("备注", "remark",""));
        } // 法人工行划扣生成
        else if("02001".equals(bankType)&&("11023002".equals(custClassId))){// 法人工行
            cellMapList.add(new ExcelExportUtil.CellMap("顺序号", "","rowNumber"));
            cellMapList.add(new ExcelExportUtil.CellMap("币种", "currency",""));
            cellMapList.add(new ExcelExportUtil.CellMap("金额", "payAmt","number"));
            cellMapList.add(new ExcelExportUtil.CellMap("付款账号开户行", "payBank",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付款账号", "payAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("付款账号名称", "payName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号开户行", "recBank",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号省份", "province",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号城市", "areaName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号地区码", "areaCode",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号", "recAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号名称", "recUnit",""));
            cellMapList.add(new ExcelExportUtil.CellMap("汇款用途", "useType",""));
            cellMapList.add(new ExcelExportUtil.CellMap("协议编号", "dealNo",""));
            cellMapList.add(new ExcelExportUtil.CellMap("备注信息", "remark",""));
            cellMapList.add(new ExcelExportUtil.CellMap("汇款方式", "hkStyle",""));
            cellMapList.add(new ExcelExportUtil.CellMap("收款账号短信通知手机号码", "telNumber",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义序号", "relId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("合同号", "contractId",""));
        } // 自然人农行划扣生成
        else if("02008".equals(bankType)&&("11023001".equals(custClassId))){
            cellMapList.add(new ExcelExportUtil.CellMap("账单编号", "payNumber",""));
            cellMapList.add(new ExcelExportUtil.CellMap("账单名称", "useType",""));
            cellMapList.add(new ExcelExportUtil.CellMap("账单金额", "payAmt","number"));
            cellMapList.add(new ExcelExportUtil.CellMap("账单支付生效日(YYYY-MM-DD)", "payDate","date"));
            cellMapList.add(new ExcelExportUtil.CellMap("账单支付截止日(YYYY-MM-DD)", "payDate","date"));
            cellMapList.add(new ExcelExportUtil.CellMap("出账日(YYYY-MM-DD)", "payDate","date"));
            cellMapList.add(new ExcelExportUtil.CellMap("合约号", "treatyCode",""));
            cellMapList.add(new ExcelExportUtil.CellMap("账单备注信息", "remark",""));
            cellMapList.add(new ExcelExportUtil.CellMap("缴费客户姓名", "payName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("缴费客户地址", "",""));
            cellMapList.add(new ExcelExportUtil.CellMap("催缴手机号", "",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义1", "payName",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义2", "idCard",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义3", "payAcct",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义4", "contractId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义5", "relId",""));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义6", "","isNull"));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义7", "","isNull"));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义8", "","isNull"));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义9", "","isNull"));
            cellMapList.add(new ExcelExportUtil.CellMap("自定义10", "","isNull"));
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String planDate = "";
        // 分页提取所有明细数据
        if("11133004".equals(retamtTypeId)){
            planDate = df.format(LocalDate.now().plusDays(-5));
        }else{
            planDate = df.format(LocalDate.now());
        }
        String recBank = "";
        String recAcct = "";
        String payBank = "";

        if("02001".equals(bankType)&&("11023001".equals(custClassId))){
            recBank = "中国工商银行北京沙河支行";
            recAcct = "0200011719200082406";
            payBank = "工商银行";
        }else if("02004".equals(bankType)&&("11023001".equals(custClassId))){
            recBank = "中国建设银行北京怀柔支行";
            recAcct = "11050180360000000449-0002";
            payBank = "建设银行";
        }else if("02001".equals(bankType)&&("11023002".equals(custClassId))){ // 法人划扣仅工商
            recBank = "中国工商银行北京沙河支行";
            recAcct = "0200011719200082406";
            payBank = "工商银行";
        }else if("02008".equals(bankType)&&("11023001".equals(custClassId))){ // 自然人划扣农行
            recBank = "中国农业银行北京沙河支行";
            recAcct = "8888888888888888888";
            payBank = "农业银行";
        }

        com.github.pagehelper.Page<RmEbankdeductDetDTO> rmEbankdeductDetsDto = null;
        List<HashMap> ss = null;
        // 租金
        if("11133001".equals(retamtTypeId)){
            rmEbankdeductDetsDto = PageHelper.startPage(0, 50000);
            ss = iRmEbankdeductDetDao.findAllRmEbankdeductDets("11023001",bankType,planDate,recBank,recAcct,payBank);
        }else if("11133002".equals(retamtTypeId)){ // 罚息
            //rmEbankdeductDetsDto = PageHelper.startPage(0, 50000);
            ss = iRmEbankdeductDetDao.findAllRmEbankdeductDetsFX("11023001",bankType,planDate,recBank,recAcct,payBank);
        }else if("11133003".equals(retamtTypeId)){ // 名义价款
            //rmEbankdeductDetsDto = PageHelper.startPage(0, 50000);
            ss = iRmEbankdeductDetDao.findAllRmEbankdeductDetsMYJK("11023001",bankType,planDate,recBank,recAcct,payBank);
        }else{
            //rmEbankdeductDetsDto = PageHelper.startPage(0, 50000);
            ss = iRmEbankdeductDetDao.findAllRmEbankdeductDetsJQK("11023001",bankType,planDate,recBank,recAcct,payBank);
        }
        long total = ss.size();
        List<RmEbankdeductDet> rmEbankdeductDetsDtos = new ArrayList<RmEbankdeductDet>();
        ChangeRecordUtil changeRecordUtil = new ChangeRecordUtil();
        List files = new ArrayList();
        String retamtType = "";
        if("11133001".equals(retamtTypeId)){
            retamtType = "租金";
        }else if("11133002".equals(retamtTypeId)){ // 罚息
            retamtType = "罚息";
        }else if("11133003".equals(retamtTypeId)){ // 名义价款
            retamtType = "名义价款";
        }else{ // 结清款
            retamtType = "结清款";
        }
        //获取当前时间
        Calendar now = Calendar.getInstance();
        String nowTime = now.get(Calendar.YEAR)+"年"+(now.get(Calendar.MONTH)+1)+"月"+now.get(Calendar.DAY_OF_MONTH)+"日";
        //获取当前时间yyyy_MM_dd格式
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd");
        String format = simpleDateFormat.format(date);
        int fileNum = 1;
        // 文件保存路径
        String fileName = "";
        // 文件保存路径
        String FilePathUrl = "";
        String allZipPath = "";
        String zipFilePath = Constants.filePath()  + File.separator +
                "WYHKMX" + File.separator + format + retamtTypeId + ".xlsx";
        if(total <= 2000){
            List<RmEbankdeductDet> rmEbankdeductDets = new ArrayList<RmEbankdeductDet>();
            fileName = nowTime + retamtType + fileNum + ".xlsx";
            zipFilePath = Constants.filePath()  + File.separator +
                    "WYHKMX" + File.separator + "WYHKMXPL"+ File.separator + fileName;
            // 转对象
            for(int i =0; i< ss.size();i++){
                RmEbankdeductDet rmEbankdeductDetsDt = (RmEbankdeductDet)changeRecordUtil.mapToBean(RmEbankdeductDet.class,ss.get(i));
                rmEbankdeductDetsDtos.add(rmEbankdeductDetsDt);
                rmEbankdeductDets.add(rmEbankdeductDetsDt);
            }
            File fil = new File(zipFilePath);
            // 检测是否存在目录
            if (fil.isFile() && fil.exists()) {
                fil.delete();
            }
            if (!fil.getParentFile().exists()) {
                fil.getParentFile().mkdirs();
            }
            try {
                ExcelExportUtil.exportSXSSFExcel("网银划扣明细", cellMapList, rmEbankdeductDets, 10, new FileOutputStream(fil));
            } catch (Exception e) {
                e.printStackTrace();
                log.error("网银划扣明细导出出现异常");
            }
            //ZipUtils.zip(zipFilePath,FilePathUrl);
        }else{
            //因中文名称文件压缩后下载时乱码,将文件重新命名
            zipFilePath = Constants.filePath()  + File.separator +
                    "WYHKMX" + File.separator + "WYHKMXPL" + File.separator+ format + retamtTypeId +".zip";
            for(int j = 0 ; j <((total-1)/2000+1); j++ ){
                //存放分页数据
                List rmEbankdeductDets = new ArrayList<RmEbankdeductDet>();
                fileName = nowTime + retamtType + fileNum + ".xlsx";
                FilePathUrl = Constants.filePath()  + File.separator +
                        "WYHKMX" + File.separator + "WYHKMXPL" + File.separator + nowTime + retamtType + File.separator + fileName;
                allZipPath = Constants.filePath()  + File.separator +
                        "WYHKMX" + File.separator + "WYHKMXPL" + File.separator + nowTime + retamtType;
                // 分页提取所有明细数据
                DateTimeFormatter df1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String planDat = "";
                // 分页提取所有明细数据
                if("11133004".equals(retamtTypeId)){
                    planDat = df1.format(LocalDate.now().plusDays(-5));
                }else{
                    planDat = df1.format(LocalDate.now());
                }
                String recBankd = "";
                String recAcctt = "";
                String payBankk = "";

                if("02001".equals(bankType)&&("11023001".equals(custClassId))){
                    recBankd = "中国工商银行北京沙河支行";
                    recAcctt = "0200011719200082406";
                    payBankk = "工商银行";
                }else if("02004".equals(bankType)&&("11023001".equals(custClassId))){
                    recBankd = "中国建设银行北京怀柔支行";
                    recAcctt = "11050180360000000449-0002";
                    payBankk = "建设银行";
                }else if("02001".equals(bankType)&&("11023002".equals(custClassId))){ // 法人划扣仅工商
                    recBankd = "中国工商银行北京沙河支行";
                    recAcctt = "0200011719200082406";
                    payBankk = "工商银行";
                }else if("02008".equals(bankType)&&("11023001".equals(custClassId))){ // 自然人划扣农行
                    recBankd = "中国农业银行北京沙河支行";
                    recAcctt = "8888888888888888888";
                    payBankk = "农业银行";
                }
                com.github.pagehelper.Page<RmEbankdeductDet> rmEbankdeductDetsD = null;
                List<HashMap> pageList = null;
                // 租金
                if("11133001".equals(retamtTypeId)){
                    rmEbankdeductDetsD = PageHelper.startPage(j+1, 2000);
                    pageList = iRmEbankdeductDetDao.findAllRmEbankdeductDets("11023001",bankType,planDat,recBankd,recAcctt,payBankk);
                }else if("11133002".equals(retamtTypeId)){ // 罚息
                    rmEbankdeductDetsD = PageHelper.startPage(j+1, 2000);
                    pageList = iRmEbankdeductDetDao.findAllRmEbankdeductDetsFX("11023001",bankType,planDat,recBankd,recAcctt,payBankk);
                }else if("11133003".equals(retamtTypeId)){ // 名义价款
                    rmEbankdeductDetsD = PageHelper.startPage(j+1, 2000);
                    pageList = iRmEbankdeductDetDao.findAllRmEbankdeductDetsMYJK("11023001",bankType,planDat,recBankd,recAcctt,payBankk);
                }else{
                    rmEbankdeductDetsDto = PageHelper.startPage(j+1, 2000);
                    pageList = iRmEbankdeductDetDao.findAllRmEbankdeductDetsJQK("11023001",bankType,planDat,recBankd,recAcctt,payBankk);
                }
                for(int i =0; i< pageList.size();i++){
                    RmEbankdeductDet rmEbankdeductDetsDt = (RmEbankdeductDet)changeRecordUtil.mapToBean(RmEbankdeductDet.class,pageList.get(i));
                  /*  RegionDTO regionDTO = new RegionDTO();
                    if(!"".equals(rmEbankdeductDetsDt.getProvince())&&(rmEbankdeductDetsDt.getProvince()!= null)){
                        regionDTO = paramRegionService.findOne(rmEbankdeductDetsDt.getProvince());
                        if(regionDTO != null){
                            rmEbankdeductDetsDt.setProvince(regionDTO.getName());
                        }
                    }
*/
                    rmEbankdeductDetsDtos.add(rmEbankdeductDetsDt);
                    rmEbankdeductDets.add(rmEbankdeductDetsDt);
                }

                File fil = new File(FilePathUrl);
                // 检测是否存在目录
                if (fil.isFile() && fil.exists()) {
                    fil.delete();
                }
                if (!fil.getParentFile().exists()) {
                    fil.getParentFile().mkdirs();
                }
                try {
                    ExcelExportUtil.exportSXSSFExcel("网银划扣明细", cellMapList, rmEbankdeductDets, 2000, new FileOutputStream(fil));
                } catch (Exception e) {
                    e.printStackTrace();
                    log.error("网银划扣明细导出出现异常");
                }
                fileNum++;
            }
            ZipUtils.zip(zipFilePath,allZipPath);
        }


        Map map = new HashMap<>();
        map.put("fileUrl",zipFilePath);
        map.put("rmEbankdeductDets",rmEbankdeductDetsDtos);
        return map;
    }
}
