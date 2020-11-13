package com.sinfusi.freedom.rm.entity;

import com.sinfusi.freedom.core.base.entity.BaseEntity;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.math.BigDecimal;


/**
 * rm_rentplantab_zl实体类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RmRentplantabZl extends BaseEntity implements Serializable{

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    private String id;
    /**
     * contract_id
     */
    private String contractId;
    /**
     * rent_sn
     */
    private Integer rentSn;
    /**
     * order_id
     */
    private String orderId;
    /**
     * cust_id
     */
    private String custId;
    /**
     * brand_code_id
     */
    private String brandCodeId;
    /**
     * resoure_code_id
     */
    private String resoureCodeId;
    /**
     * sale_type_id
     */
    private String saleTypeId;
    /**
     * agent_code_id
     */
    private String agentCodeId;
    /**
     * plan_date
     */
    private LocalDate planDate;
    /**
     * rent_amt
     */
    private BigDecimal rentAmt;
    /**
     * rest_rent_amt
     */
    private BigDecimal restRentAmt;
    /**
     * cor_amt
     */
    private BigDecimal corAmt;
    /**
     * rest_cor_amt
     */
    private BigDecimal restCorAmt;
    /**
     * int_amt
     */
    private BigDecimal intAmt;
    /**
     * rest_int_amt
     */
    private BigDecimal restIntAmt;
    /**
     * prinbl_amt
     */
    private BigDecimal prinblAmt;
    /**
     * plan_pen_amt
     */
    private BigDecimal planPenAmt;
    /**
     * fact_pen_amt
     */
    private BigDecimal factPenAmt;
    /**
     * red_pen_amt
     */
    private BigDecimal redPenAmt;
    /**
     * rest_pen_amt
     */
    private BigDecimal restPenAmt;
    /**
     * year_rate
     */
    private BigDecimal yearRate;
    /**
     * nper_ate
     */
    private BigDecimal nperAte;
    /**
     * lv_days
     */
    private Integer lvDays;
    /**
     * adjret_date
     */
    private LocalDate adjretDate;
    /**
     * adj_cal_days
     */
    private Integer adjCalDays;
    /**
     * rent_state_id
     */
    private String rentStateId;
    /**
     * pen_state_id
     */
    private String penStateId;
    /**
     * pay_way_id
     */
    private String payWayId;
    /**
     * is_pay_id
     */
    private String isPayId;
    /**
     * status_id
     */
    private String statusId;
    /**
     * over_days
     */
    private Integer overDays;
    /**
     * last_ret_date
     */
    private LocalDate lastRetDate;

    private String isAbnormalend;
}