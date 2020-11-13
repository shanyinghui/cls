package com.sinfusi.freedom.rm.criteria;

import com.sinfusi.freedom.core.base.criteria.BaseCriteria;
import com.sinfusi.freedom.core.filter.StringFilter;
import com.sinfusi.freedom.core.filter.LocalDateFilter;
import com.sinfusi.freedom.core.filter.BigDecimalFilter;
import com.sinfusi.freedom.core.filter.LocalDateTimeFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * rm_normalprice标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
@Getter
@Setter
@ToString(callSuper = true)
public class RmNormalpriceCriteria extends BaseCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private StringFilter id;
    /**
     * order_id
     */
    private StringFilter orderId;
    /**
     * cust_id
     */
    private StringFilter custId;
    /**
     * brand_code
     */
    private StringFilter brandCode;
    /**
     * resoure_code
     */
    private StringFilter resoureCode;
    /**
     * sale_type_id
     */
    private StringFilter saleTypeId;
    /**
     * agent_code
     */
    private StringFilter agentCode;
    /**
     * instcode
     */
    private StringFilter instcode;
    /**
     * plan_date
     */
    private LocalDateFilter planDate;
    /**
     * all_nprice_amt
     */
    private BigDecimalFilter allNpriceAmt;
    /**
     * nprice_amt
     */
    private BigDecimalFilter npriceAmt;
    /**
     * res_nprice_amt
     */
    private BigDecimalFilter resNpriceAmt;
    /**
     * last_ret_date
     */
    private LocalDateTimeFilter lastRetDate;
    /**
     * nprice_state_id
     */
    private StringFilter npriceStateId;
    /**
     * is_pay_id
     */
    private StringFilter isPayId;
}