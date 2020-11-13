package com.sinfusi.freedom.rm.entity;

import com.sinfusi.freedom.core.base.entity.BaseEntity;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * rm_normalprice实体类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RmNormalprice extends BaseEntity implements Serializable{

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    private String id;
    /**
     * order_id
     */
    private String orderId;
    /**
     * cust_id
     */
    private String custId;
    /**
     * brand_code
     */
    private String brandCode;
    /**
     * resoure_code
     */
    private String resoureCode;
    /**
     * sale_type_id
     */
    private String saleTypeId;
    /**
     * agent_code
     */
    private String agentCode;
    /**
     * instcode
     */
    private String instcode;
    /**
     * plan_date
     */
    private LocalDate planDate;
    /**
     * all_nprice_amt
     */
    private BigDecimal allNpriceAmt;
    /**
     * nprice_amt
     */
    private BigDecimal npriceAmt;
    /**
     * res_nprice_amt
     */
    private BigDecimal resNpriceAmt;
    /**
     * last_ret_date
     */
    private LocalDateTime lastRetDate;
    /**
     * nprice_state_id
     */
    private String npriceStateId;
    /**
     * is_pay_id
     */
    private String isPayId;
}