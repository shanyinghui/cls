package com.sinfusi.freedom.rm.criteria;

import com.sinfusi.freedom.core.base.criteria.BaseCriteria;
import com.sinfusi.freedom.core.filter.StringFilter;
import com.sinfusi.freedom.core.filter.LocalDateFilter;
import com.sinfusi.freedom.core.filter.BigDecimalFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * rm_penaltytal_zl标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
@Getter
@Setter
@ToString(callSuper = true)
public class RmPenaltytalZlCriteria extends BaseCriteria implements Serializable {

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
     * fact_pen_amt
     */
    private BigDecimalFilter factPenAmt;
    /**
     * rest_pen_amt
     */
    private BigDecimalFilter restPenAmt;
    /**
     * last_ret_date
     */
    private LocalDateFilter lastRetDate;
    /**
     * pen_state_id
     */
    private StringFilter penStateId;
    /**
     * is_pay_id
     */
    private StringFilter isPayId;
}