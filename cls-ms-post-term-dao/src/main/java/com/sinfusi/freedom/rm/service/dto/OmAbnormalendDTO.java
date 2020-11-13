package com.sinfusi.freedom.rm.service.dto;


import com.sinfusi.freedom.convert.annotation.CacheDict;
import com.sinfusi.freedom.core.base.dto.BaseDTO;
import lombok.*;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OmAbnormalendDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单结清主键可以直接使用【流程编号】
     */
    private String id;
    /**
     * 合同编号
     */
    private String contractId;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 申请日期
     */
    private LocalDate applyDate;
    /**
     * 结清类型
     */
    private String endTypeId;
    @CacheDict(keyProperty = "endTypeId")
    private String endTypeName;
    /**
     * 支付方式
     */
    private String payTypeId;
    @CacheDict(keyProperty = "payTypeId")
    private String payTypeName;
    /**
     * 是否还款中
     */
    private String isPayId;
    /**
     * 核销日期
     */
    private LocalDate hireDate;
    /**
     * 结算日
     */
    private LocalDate calDate;
    /**
     * 结清金额
     */
    private BigDecimal overTalAmt;
    /**
     * 剩余金额
     */
    private BigDecimal noRetRentAmt;
    /**
     * 利息减免
     */
    private BigDecimal insReduceAmt;
    /**
     * 剩余本金
     */
    private BigDecimal noRetCorAmt;
    /**
     * 剩余利息
     */
    private BigDecimal noRetIntAmt;
    /**
     * 未到期总期数
     */
    private Integer beforeDueCount;
    /**
     * 未到期利息总额（排除当期）
     */
    private BigDecimal beforeDueIntAmt;
    /**
     * 未到期本金总额 （排除当期）
     */
    private BigDecimal beforeDueCorAmt;
    /**
     * 部分结清本金
     */
    private BigDecimal partyEndCorAmt;
    /**
     * 提前部分结清利息
     */
    private BigDecimal partyEndIntAmt;
    /**
     * 应收罚息
     */
    private BigDecimal penaltyAmt;
    /**
     * 减免罚息金额
     */
    private BigDecimal redPenaltyAmt;
    /**
     * 合同损失金
     */
    private BigDecimal contractLoseAmt;
    /**
     * 减免合同损失金
     */
    private BigDecimal redContLoseAmt;
    /**
     * 名义价款
     */
    private BigDecimal normalPriceAmt;
    /**
     * 合同违约金
     */
    private BigDecimal contractBreakAmt;
    /**
     * 使用资金池金额
     */
    private BigDecimal useRentPoolAmt;
    /**
     * 其他减免金额
     */
    private BigDecimal otherReduceAmt;
    /**
     * 其他金额
     */
    private BigDecimal otherAmt;
    /**
     * 逾期租金
     */
    private BigDecimal overDueRentAmt;
    /**
     * 当期应付租金
     */
    private BigDecimal currPeriodRentAmt;
    /**
     * 当期租金期次
     */
    private Integer currPeriodRentSn;
    /**
     * 当期租金还款日期
     */
    private LocalDate currPeriodRetDate;
    /**
     * 结清车辆台数
     */
    private Integer endCars;
    /**
     * 中车收款账号
     */
    private String receiveAcct;
    /**
     * 中车收款银行
     */
    private String receiveBank;
    /**
     * 客户付款账号
     */
    private String payAcctount;
    /**
     * 客户付款银行
     */
    private String payBank;
    /**
     * 结清开始期次
     */
    private BigDecimal endRentSn;
    /**
     * 原因
     */
    private String reason;
    /**
     * 车辆控制状态
     */
    private String carCtrLstateId;
    @CacheDict(keyProperty = "carCtrLstateId")
    private String carCtrLstateName;
    /**
     * 债权转移时间
     */
    private LocalDate oblTranTime;
    /**
     * 债权是否转移
     */
    private String isOblTranId;
    /**
     * 结清状态
     */
    private String endStateId;
    @CacheDict(keyProperty = "endStateId")
    private String endStateName;
    /**
     * 是否打印
     */
    private String isPrintId;
    @CacheDict(keyProperty = "isPrintId")
    private String isPrintName;
    /**
     * 关系主键
     */
    private String processInstId;
    /**
     * 租赁利率
     */
    private BigDecimal leaseRatio;
    /**
     * 年号
     */
    private String yearNum;
    /**
     * 结清号
     */
    private String endNo;
    /**
     * 汇款时间
     */
    private LocalDate payDate;
    /**
     * 汇款金额
     */
    private BigDecimal payAmt;
    /**
     * 汇款备注
     */
    private String payRemark;
    /**
     * 确认状态
     */
    private String checkStateId;
    @CacheDict(keyProperty = "checkStateId")
    private String checkStateName;

    /**
     * 收车日期
     */
    private String carReceivedDate;
    /**
     * 收车主体
     */
    private String carReceivedSubject;
    @CacheDict(keyProperty = "carReceivedSubject")
    private String carReceivedSubjectName;
    /**
     * 车辆停放位置
     */
    private String carParkPosition;
    /**
     * 利息减免
     */
    private BigDecimal amtReduceAmt;
    /**
     * 剩余总本金(首付融 用于重新计算租金计划表)
     */
    private BigDecimal optionRestTotalCorAmt;
    /**
     * 剩余总本金(尾款 用于重新计算组件计划表)
     */
    private BigDecimal tailRestTotalCorAmt;
    /**
     * 划扣状态
     */
    private String deductStatusId;
}