package com.sinfusi.freedom.rm.criteria;

import com.sinfusi.freedom.core.base.criteria.BaseCriteria;
import com.sinfusi.freedom.core.filter.BigDecimalFilter;
import com.sinfusi.freedom.core.filter.IntegerFilter;
import com.sinfusi.freedom.core.filter.LocalDateFilter;
import com.sinfusi.freedom.core.filter.StringFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * rm_ebankdeduct_det标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
@Getter
@Setter
@ToString(callSuper = true)
public class RmEbankdeductDetCriteria extends BaseCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private StringFilter id;
    /**
     * water_id
     */
    private StringFilter waterId;
    /**
     * rel_id
     */
    private StringFilter relId;
    /**
     * retamt_type_id
     */
    private StringFilter retamtTypeId;
    /**
     * pay_no
     */
    private StringFilter payNo;
    /**
     * deal_no
     */
    private StringFilter dealNo;
    /**
     * currency
     */
    private StringFilter currency;
    /**
     * province
     */
    private StringFilter province;
    /**
     * area_name
     */
    private StringFilter areaName;
    /**
     * area_code
     */
    private StringFilter areaCode;
    /**
     * rec_bank
     */
    private StringFilter recBank;
    /**
     * rec_acct
     */
    private StringFilter recAcct;
    /**
     * rec_unit
     */
    private StringFilter recUnit;
    /**
     * pay_bank
     */
    private StringFilter payBank;
    /**
     * pay_acct
     */
    private StringFilter payAcct;
    /**
     * pay_name
     */
    private StringFilter payName;
    /**
     * pay_bank_no
     */
    private StringFilter payBankNo;
    /**
     * ICBC_id
     */
    private StringFilter icbcId;
    /**
     * pay_amt
     */
    private BigDecimalFilter payAmt;
    /**
     * fact_amt
     */
    private BigDecimalFilter factAmt;
    /**
     * use_type
     */
    private StringFilter useType;
    /**
     * proxy_water_id
     */
    private StringFilter proxyWaterId;
    /**
     * commid
     */
    private StringFilter commid;
    /**
     * resp_code_id
     */
    private StringFilter respCodeId;
    /**
     * resp_result
     */
    private StringFilter respResult;
    /**
     * tel_number
     */
    private StringFilter telNumber;
    /**
     * is_send_mess_id
     */
    private StringFilter isSendMessId;
    /**
     * hire_state_id
     */
    private StringFilter hireStateId;
    /**
     * jyc_relid
     */
    private StringFilter jycRelid;
    /**
     * pay_channel_id
     */
    private StringFilter payChannelId;
    /**
     * half_deduct_times
     */
    private IntegerFilter halfDeductTimes;
    /**
     * remark
     */
    private StringFilter remark;
    /**
     * state_id
     */
    private StringFilter stateId;

    private StringFilter brandCodeId;

    private StringFilter agentName;

    private StringFilter agentCode;

    private StringFilter contractId;

    private StringFilter custName;

    private StringFilter brandName;

    private LocalDateFilter makeTime;

    private StringFilter marketId;

}
