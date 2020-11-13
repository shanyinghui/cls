package com.sinfusi.freedom.rm.criteria;

import com.sinfusi.freedom.core.base.criteria.BaseCriteria;
import com.sinfusi.freedom.core.filter.StringFilter;
import com.sinfusi.freedom.core.filter.IntegerFilter;
import com.sinfusi.freedom.core.filter.LocalDateFilter;
import com.sinfusi.freedom.core.filter.BigDecimalFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * rm_rentplantab_zl标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
@Getter
@Setter
@ToString(callSuper = true)
public class RmRentplantabZlCriteria extends BaseCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private StringFilter id;
    /**
     * contract_id
     */
    private StringFilter contractId;
    /**
     * rent_sn
     */
    private IntegerFilter rentSn;
    /**
     * order_id
     */
    private StringFilter orderId;
    /**
     * cust_id
     */
    private StringFilter custId;
    /**
     * brand_code_id
     */
    private StringFilter brandCodeId;
    /**
     * resoure_code_id
     */
    private StringFilter resoureCodeId;
    /**
     * sale_type_id
     */
    private StringFilter saleTypeId;
    /**
     * agent_code_id
     */
    private StringFilter agentCodeId;
    /**
     * plan_date
     */
    private LocalDateFilter planDate;
    /**
     * rent_amt
     */
    private BigDecimalFilter rentAmt;
    /**
     * rest_rent_amt
     */
    private BigDecimalFilter restRentAmt;
    /**
     * cor_amt
     */
    private BigDecimalFilter corAmt;
    /**
     * rest_cor_amt
     */
    private BigDecimalFilter restCorAmt;
    /**
     * int_amt
     */
    private BigDecimalFilter intAmt;
    /**
     * rest_int_amt
     */
    private BigDecimalFilter restIntAmt;
    /**
     * prinbl_amt
     */
    private BigDecimalFilter prinblAmt;
    /**
     * plan_pen_amt
     */
    private BigDecimalFilter planPenAmt;
    /**
     * fact_pen_amt
     */
    private BigDecimalFilter factPenAmt;
    /**
     * red_pen_amt
     */
    private BigDecimalFilter redPenAmt;
    /**
     * rest_pen_amt
     */
    private BigDecimalFilter restPenAmt;
    /**
     * year_rate
     */
    private BigDecimalFilter yearRate;
    /**
     * nper_ate
     */
    private BigDecimalFilter nperAte;
    /**
     * lv_days
     */
    private IntegerFilter lvDays;
    /**
     * adjret_date
     */
    private LocalDateFilter adjretDate;
    /**
     * adj_cal_days
     */
    private IntegerFilter adjCalDays;
    /**
     * rent_state_id
     */
    private StringFilter rentStateId;
    /**
     * pen_state_id
     */
    private StringFilter penStateId;
    /**
     * pay_way_id
     */
    private StringFilter payWayId;
    /**
     * is_pay_id
     */
    private StringFilter isPayId;
    /**
     * status_id
     */
    private StringFilter statusId;
    /**
     * over_days
     */
    private IntegerFilter overDays;
    /**
     * last_ret_date
     */
    private LocalDateFilter lastRetDate;
}