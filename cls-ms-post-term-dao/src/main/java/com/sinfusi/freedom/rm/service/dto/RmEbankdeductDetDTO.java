package com.sinfusi.freedom.rm.service.dto;

import com.sinfusi.freedom.core.base.dto.BaseDTO;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


/**
 * rm_ebankdeduct_detDTO类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RmEbankdeductDetDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * water_id
     */
    private String waterId;
    /**
     * rel_id
     */
    private String relId;
    /**
     * retamt_type_id
     */
    private String retamtTypeId;
    /**
     * pay_no
     */
    private String payNo;
    /**
     * deal_no
     */
    private String dealNo;
    /**
     * currency
     */
    private String currency;
    /**
     * province
     */
    private String province;
    /**
     * area_name
     */
    private String areaName;
    /**
     * area_code
     */
    private String areaCode;
    /**
     * rec_bank
     */
    private String recBank;
    /**
     * rec_acct
     */
    private String recAcct;
    /**
     * rec_unit
     */
    private String recUnit;
    /**
     * pay_bank
     */
    private String payBank;
    /**
     * pay_acct
     */
    private String payAcct;
    /**
     * pay_name
     */
    private String payName;
    /**
     * pay_bank_no
     */
    private String payBankNo;
    /**
     * ICBC_id
     */
    private String icbcId;
    /**
     * pay_amt
     */
    private BigDecimal payAmt;
    /**
     * fact_amt
     */
    private BigDecimal factAmt;
    /**
     * use_type
     */
    private String useType;
    /**
     * proxy_water_id
     */
    private String proxyWaterId;
    /**
     * commid
     */
    private String commid;
    /**
     * resp_code_id
     */
    private String respCodeId;
    /**
     * resp_result
     */
    private String respResult;
    /**
     * tel_number
     */
    private String telNumber;
    /**
     * is_send_mess_id
     */
    private String isSendMessId;
    /**
     * hire_state_id
     */
    private String hireStateId;
    /**
     * jyc_relid
     */
    private String jycRelid;
    /**
     * pay_channel_id
     */
    private String payChannelId;
    /**
     * half_deduct_times
     */
    private Integer halfDeductTimes;
    /**
     * remark
     */
    private String remark;
    /**
     * state_id
     */
    private String stateId;
    /**
     * 收款企业账号名称
     */
    private String recName = "北京中车信融融资租赁有限公司";
    /**
     * 付款方开户行名称 建设银行
     */
    private String payCCBBank;
    /**
     * 汇款方式
     */
    private String hkStyle = "普通";
    /**
     * 客户方流水号
     */
    private String lsh;
    /**
     * 合约号
     */
    private String treatyCode;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 账单编号
     */
    private String payNumber;
    /**
     * 账单支付生效日
     */
    private LocalDate payDate = LocalDate.now();

    private String contractId;
}