package com.sinfusi.freedom.rm.service.impl;


import com.sinfusi.freedom.convert.ConvertUtil;
import com.sinfusi.freedom.core.base.service.impl.BaseServiceImpl;
import com.sinfusi.freedom.core.utils.Assert;
import com.sinfusi.freedom.core.utils.CommUtils;
import com.sinfusi.freedom.order.dao.IOmAbnormalendDao;
import com.sinfusi.freedom.order.entity.OmAbnormalend;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductDetDao;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductfileDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductDet;
import com.sinfusi.freedom.rm.entity.RmEbankdeductfile;
import com.sinfusi.freedom.rm.example.RmEbankdeductDetExample;
import com.sinfusi.freedom.rm.example.RmEbankdeductfileExample;
import com.sinfusi.freedom.rm.service.IOmAbnormalendService;
import com.sinfusi.freedom.rm.service.dto.OmAbnormalendDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmAbnormalendServiceImpl extends BaseServiceImpl<String, OmAbnormalend> implements IOmAbnormalendService {
    @Autowired
    private IOmAbnormalendDao omAbnormalendDao;

    @Autowired
    private ConvertUtil convertUtil;
    @Autowired
    private IRmEbankdeductfileDao iRmEbankdeductfileDao;
    @Autowired
    private IRmEbankdeductDetDao iRmEbankdeductDetDao;



    @Override
    public OmAbnormalendDTO findOne(String id) {
        OmAbnormalend omAbnormalend = this.omAbnormalendDao.selectById(id);

        OmAbnormalendDTO omAbnormalendDTO = this.convertUtil.toDTO(omAbnormalend, OmAbnormalendDTO.class);
        if (omAbnormalend.getInsReduceAmt() != null) {
            omAbnormalendDTO.setAmtReduceAmt(omAbnormalend.getInsReduceAmt());
        }
        return omAbnormalendDTO;
    }

    /**
     * 创建/更新.
     *
     * @param omAbnormalendDTO
     * @return
     */
    @Override
    public OmAbnormalendDTO createOrUpdate(OmAbnormalendDTO omAbnormalendDTO) {
        OmAbnormalend omAbnormalend = convertUtil.toEntity(omAbnormalendDTO, OmAbnormalend.class);
        if (CommUtils.isEmptyStr(omAbnormalend.getId())) {
            int result = this.omAbnormalendDao.insert(omAbnormalend);
            Assert.notEquals(result, 0, "新建失败!");
        } else {
            int result = this.omAbnormalendDao.update(omAbnormalend);
            Assert.notEquals(result, 0, "更新失败!");
        }
        OmAbnormalendDTO abnormalendDTO = convertUtil.toDTO(omAbnormalend, OmAbnormalendDTO.class);
        if (omAbnormalend.getInsReduceAmt() != null) {
            abnormalendDTO.setAmtReduceAmt(omAbnormalend.getInsReduceAmt());
        }
        return abnormalendDTO;
    }



    private void deleteRmEbankdeductDetAndFile(String relId) {
        RmEbankdeductDetExample example = new RmEbankdeductDetExample();
        example.createCriteria().andRelIdEqualTo(relId)
                .andStateIdEqualTo("10001000");
        List<RmEbankdeductDet> rmEbankdeductDets = this.iRmEbankdeductDetDao.selectByExample(example);
        if (!CommUtils.isEmptyList(rmEbankdeductDets)) {
            rmEbankdeductDets.forEach(item -> {
                this.iRmEbankdeductDetDao.deleteById(item.getId());
            });
        }

        RmEbankdeductfileExample fileExample = new RmEbankdeductfileExample();
        fileExample.createCriteria().andRelIdEqualTo(relId)
                .andStateIdEqualTo("10001000");
        List<RmEbankdeductfile> rmEbankdeductfiles = this.iRmEbankdeductfileDao.selectByExample(fileExample);
        if (!CommUtils.isEmptyList(rmEbankdeductfiles)) {
            rmEbankdeductfiles.forEach(item -> {
                this.iRmEbankdeductfileDao.deleteById(item.getId());
            });
        }
    }







}
