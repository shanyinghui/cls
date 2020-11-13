package com.sinfusi.freedom.rm.example;

import com.sinfusi.freedom.core.example.AbstractCriteria;
import com.sinfusi.freedom.core.example.AbstractExample;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.List;

/**
 * rm_penaltytal_zl标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
public class RmPenaltytalZlExample extends AbstractExample<RmPenaltytalZlExample.GeneratedCriteria> {

    @Override
    protected GeneratedCriteria createCriteriaInternal() {
        return new GeneratedCriteria();
    }

    public static class GeneratedCriteria extends AbstractCriteria {
        public GeneratedCriteria andIdIsNull() {
            addCriterion("ID is null");
            return this;
        }

        public GeneratedCriteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return this;
        }

        public GeneratedCriteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return this;
        }

        public GeneratedCriteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return this;
        }

        public GeneratedCriteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return this;
        }

        public GeneratedCriteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return this;
        }

        public GeneratedCriteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return this;
        }

        public GeneratedCriteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return this;
        }

        public GeneratedCriteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return this;
        }

        public GeneratedCriteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return this;
        }

        public GeneratedCriteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return this;
        }

        public GeneratedCriteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return this;
        }

        public GeneratedCriteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return this;
        }

        public GeneratedCriteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return this;
        }
        public GeneratedCriteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return this;
        }

        public GeneratedCriteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return this;
        }

        public GeneratedCriteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return this;
        }

        public GeneratedCriteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return this;
        }
        public GeneratedCriteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return this;
        }

        public GeneratedCriteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return this;
        }

        public GeneratedCriteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return this;
        }

        public GeneratedCriteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return this;
        }
        public GeneratedCriteria andBrandCodeIsNull() {
            addCriterion("BRAND_CODE is null");
            return this;
        }

        public GeneratedCriteria andBrandCodeIsNotNull() {
            addCriterion("BRAND_CODE is not null");
            return this;
        }

        public GeneratedCriteria andBrandCodeEqualTo(String value) {
            addCriterion("BRAND_CODE =", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeNotEqualTo(String value) {
            addCriterion("BRAND_CODE <>", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeGreaterThan(String value) {
            addCriterion("BRAND_CODE >", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE >=", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeLessThan(String value) {
            addCriterion("BRAND_CODE <", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE <=", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeLike(String value) {
            addCriterion("BRAND_CODE like", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeNotLike(String value) {
            addCriterion("BRAND_CODE not like", value, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeIn(List<String> values) {
            addCriterion("BRAND_CODE in", values, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeNotIn(List<String> values) {
            addCriterion("BRAND_CODE not in", values, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeBetween(String value1, String value2) {
            addCriterion("BRAND_CODE between", value1, value2, "brandCode");
            return this;
        }

        public GeneratedCriteria andBrandCodeNotBetween(String value1, String value2) {
            addCriterion("BRAND_CODE not between", value1, value2, "brandCode");
            return this;
        }
        public GeneratedCriteria andResoureCodeIsNull() {
            addCriterion("RESOURE_CODE is null");
            return this;
        }

        public GeneratedCriteria andResoureCodeIsNotNull() {
            addCriterion("RESOURE_CODE is not null");
            return this;
        }

        public GeneratedCriteria andResoureCodeEqualTo(String value) {
            addCriterion("RESOURE_CODE =", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeNotEqualTo(String value) {
            addCriterion("RESOURE_CODE <>", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeGreaterThan(String value) {
            addCriterion("RESOURE_CODE >", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURE_CODE >=", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeLessThan(String value) {
            addCriterion("RESOURE_CODE <", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeLessThanOrEqualTo(String value) {
            addCriterion("RESOURE_CODE <=", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeLike(String value) {
            addCriterion("RESOURE_CODE like", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeNotLike(String value) {
            addCriterion("RESOURE_CODE not like", value, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeIn(List<String> values) {
            addCriterion("RESOURE_CODE in", values, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeNotIn(List<String> values) {
            addCriterion("RESOURE_CODE not in", values, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeBetween(String value1, String value2) {
            addCriterion("RESOURE_CODE between", value1, value2, "resoureCode");
            return this;
        }

        public GeneratedCriteria andResoureCodeNotBetween(String value1, String value2) {
            addCriterion("RESOURE_CODE not between", value1, value2, "resoureCode");
            return this;
        }
        public GeneratedCriteria andSaleTypeIdIsNull() {
            addCriterion("SALE_TYPE_ID is null");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdIsNotNull() {
            addCriterion("SALE_TYPE_ID is not null");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdEqualTo(String value) {
            addCriterion("SALE_TYPE_ID =", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdNotEqualTo(String value) {
            addCriterion("SALE_TYPE_ID <>", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdGreaterThan(String value) {
            addCriterion("SALE_TYPE_ID >", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE_ID >=", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdLessThan(String value) {
            addCriterion("SALE_TYPE_ID <", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdLessThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE_ID <=", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdLike(String value) {
            addCriterion("SALE_TYPE_ID like", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdNotLike(String value) {
            addCriterion("SALE_TYPE_ID not like", value, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdIn(List<String> values) {
            addCriterion("SALE_TYPE_ID in", values, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdNotIn(List<String> values) {
            addCriterion("SALE_TYPE_ID not in", values, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdBetween(String value1, String value2) {
            addCriterion("SALE_TYPE_ID between", value1, value2, "saleTypeId");
            return this;
        }

        public GeneratedCriteria andSaleTypeIdNotBetween(String value1, String value2) {
            addCriterion("SALE_TYPE_ID not between", value1, value2, "saleTypeId");
            return this;
        }
        public GeneratedCriteria andAgentCodeIsNull() {
            addCriterion("AGENT_CODE is null");
            return this;
        }

        public GeneratedCriteria andAgentCodeIsNotNull() {
            addCriterion("AGENT_CODE is not null");
            return this;
        }

        public GeneratedCriteria andAgentCodeEqualTo(String value) {
            addCriterion("AGENT_CODE =", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeNotEqualTo(String value) {
            addCriterion("AGENT_CODE <>", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeGreaterThan(String value) {
            addCriterion("AGENT_CODE >", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE >=", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeLessThan(String value) {
            addCriterion("AGENT_CODE <", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE <=", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeLike(String value) {
            addCriterion("AGENT_CODE like", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeNotLike(String value) {
            addCriterion("AGENT_CODE not like", value, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeIn(List<String> values) {
            addCriterion("AGENT_CODE in", values, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeNotIn(List<String> values) {
            addCriterion("AGENT_CODE not in", values, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeBetween(String value1, String value2) {
            addCriterion("AGENT_CODE between", value1, value2, "agentCode");
            return this;
        }

        public GeneratedCriteria andAgentCodeNotBetween(String value1, String value2) {
            addCriterion("AGENT_CODE not between", value1, value2, "agentCode");
            return this;
        }
        public GeneratedCriteria andInstcodeIsNull() {
            addCriterion("INSTCODE is null");
            return this;
        }

        public GeneratedCriteria andInstcodeIsNotNull() {
            addCriterion("INSTCODE is not null");
            return this;
        }

        public GeneratedCriteria andInstcodeEqualTo(String value) {
            addCriterion("INSTCODE =", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeNotEqualTo(String value) {
            addCriterion("INSTCODE <>", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeGreaterThan(String value) {
            addCriterion("INSTCODE >", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTCODE >=", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeLessThan(String value) {
            addCriterion("INSTCODE <", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeLessThanOrEqualTo(String value) {
            addCriterion("INSTCODE <=", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeLike(String value) {
            addCriterion("INSTCODE like", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeNotLike(String value) {
            addCriterion("INSTCODE not like", value, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeIn(List<String> values) {
            addCriterion("INSTCODE in", values, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeNotIn(List<String> values) {
            addCriterion("INSTCODE not in", values, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeBetween(String value1, String value2) {
            addCriterion("INSTCODE between", value1, value2, "instcode");
            return this;
        }

        public GeneratedCriteria andInstcodeNotBetween(String value1, String value2) {
            addCriterion("INSTCODE not between", value1, value2, "instcode");
            return this;
        }
        public GeneratedCriteria andPlanDateIsNull() {
            addCriterion("PLAN_DATE is null");
            return this;
        }

        public GeneratedCriteria andPlanDateIsNotNull() {
            addCriterion("PLAN_DATE is not null");
            return this;
        }

        public GeneratedCriteria andPlanDateEqualTo(LocalDate value) {
            addCriterion("PLAN_DATE =", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateNotEqualTo(LocalDate value) {
            addCriterion("PLAN_DATE <>", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateGreaterThan(LocalDate value) {
            addCriterion("PLAN_DATE >", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("PLAN_DATE >=", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateLessThan(LocalDate value) {
            addCriterion("PLAN_DATE <", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("PLAN_DATE <=", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateLike(LocalDate value) {
            addCriterion("PLAN_DATE like", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateNotLike(LocalDate value) {
            addCriterion("PLAN_DATE not like", value, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateIn(List<LocalDate> values) {
            addCriterion("PLAN_DATE in", values, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateNotIn(List<LocalDate> values) {
            addCriterion("PLAN_DATE not in", values, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PLAN_DATE between", value1, value2, "planDate");
            return this;
        }

        public GeneratedCriteria andPlanDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("PLAN_DATE not between", value1, value2, "planDate");
            return this;
        }
        public GeneratedCriteria andFactPenAmtIsNull() {
            addCriterion("FACT_PEN_AMT is null");
            return this;
        }

        public GeneratedCriteria andFactPenAmtIsNotNull() {
            addCriterion("FACT_PEN_AMT is not null");
            return this;
        }

        public GeneratedCriteria andFactPenAmtEqualTo(BigDecimal value) {
            addCriterion("FACT_PEN_AMT =", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtNotEqualTo(BigDecimal value) {
            addCriterion("FACT_PEN_AMT <>", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtGreaterThan(BigDecimal value) {
            addCriterion("FACT_PEN_AMT >", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_PEN_AMT >=", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtLessThan(BigDecimal value) {
            addCriterion("FACT_PEN_AMT <", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_PEN_AMT <=", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtLike(BigDecimal value) {
            addCriterion("FACT_PEN_AMT like", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtNotLike(BigDecimal value) {
            addCriterion("FACT_PEN_AMT not like", value, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtIn(List<BigDecimal> values) {
            addCriterion("FACT_PEN_AMT in", values, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtNotIn(List<BigDecimal> values) {
            addCriterion("FACT_PEN_AMT not in", values, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_PEN_AMT between", value1, value2, "factPenAmt");
            return this;
        }

        public GeneratedCriteria andFactPenAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_PEN_AMT not between", value1, value2, "factPenAmt");
            return this;
        }
        public GeneratedCriteria andRestPenAmtIsNull() {
            addCriterion("REST_PEN_AMT is null");
            return this;
        }

        public GeneratedCriteria andRestPenAmtIsNotNull() {
            addCriterion("REST_PEN_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRestPenAmtEqualTo(BigDecimal value) {
            addCriterion("REST_PEN_AMT =", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtNotEqualTo(BigDecimal value) {
            addCriterion("REST_PEN_AMT <>", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtGreaterThan(BigDecimal value) {
            addCriterion("REST_PEN_AMT >", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_PEN_AMT >=", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtLessThan(BigDecimal value) {
            addCriterion("REST_PEN_AMT <", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_PEN_AMT <=", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtLike(BigDecimal value) {
            addCriterion("REST_PEN_AMT like", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtNotLike(BigDecimal value) {
            addCriterion("REST_PEN_AMT not like", value, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtIn(List<BigDecimal> values) {
            addCriterion("REST_PEN_AMT in", values, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtNotIn(List<BigDecimal> values) {
            addCriterion("REST_PEN_AMT not in", values, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_PEN_AMT between", value1, value2, "restPenAmt");
            return this;
        }

        public GeneratedCriteria andRestPenAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_PEN_AMT not between", value1, value2, "restPenAmt");
            return this;
        }
        public GeneratedCriteria andLastRetDateIsNull() {
            addCriterion("LAST_RET_DATE is null");
            return this;
        }

        public GeneratedCriteria andLastRetDateIsNotNull() {
            addCriterion("LAST_RET_DATE is not null");
            return this;
        }

        public GeneratedCriteria andLastRetDateEqualTo(LocalDate value) {
            addCriterion("LAST_RET_DATE =", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateNotEqualTo(LocalDate value) {
            addCriterion("LAST_RET_DATE <>", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateGreaterThan(LocalDate value) {
            addCriterion("LAST_RET_DATE >", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("LAST_RET_DATE >=", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateLessThan(LocalDate value) {
            addCriterion("LAST_RET_DATE <", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("LAST_RET_DATE <=", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateLike(LocalDate value) {
            addCriterion("LAST_RET_DATE like", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateNotLike(LocalDate value) {
            addCriterion("LAST_RET_DATE not like", value, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateIn(List<LocalDate> values) {
            addCriterion("LAST_RET_DATE in", values, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateNotIn(List<LocalDate> values) {
            addCriterion("LAST_RET_DATE not in", values, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("LAST_RET_DATE between", value1, value2, "lastRetDate");
            return this;
        }

        public GeneratedCriteria andLastRetDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("LAST_RET_DATE not between", value1, value2, "lastRetDate");
            return this;
        }
        public GeneratedCriteria andPenStateIdIsNull() {
            addCriterion("PEN_STATE_ID is null");
            return this;
        }

        public GeneratedCriteria andPenStateIdIsNotNull() {
            addCriterion("PEN_STATE_ID is not null");
            return this;
        }

        public GeneratedCriteria andPenStateIdEqualTo(String value) {
            addCriterion("PEN_STATE_ID =", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdNotEqualTo(String value) {
            addCriterion("PEN_STATE_ID <>", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdGreaterThan(String value) {
            addCriterion("PEN_STATE_ID >", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("PEN_STATE_ID >=", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdLessThan(String value) {
            addCriterion("PEN_STATE_ID <", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdLessThanOrEqualTo(String value) {
            addCriterion("PEN_STATE_ID <=", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdLike(String value) {
            addCriterion("PEN_STATE_ID like", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdNotLike(String value) {
            addCriterion("PEN_STATE_ID not like", value, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdIn(List<String> values) {
            addCriterion("PEN_STATE_ID in", values, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdNotIn(List<String> values) {
            addCriterion("PEN_STATE_ID not in", values, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdBetween(String value1, String value2) {
            addCriterion("PEN_STATE_ID between", value1, value2, "penStateId");
            return this;
        }

        public GeneratedCriteria andPenStateIdNotBetween(String value1, String value2) {
            addCriterion("PEN_STATE_ID not between", value1, value2, "penStateId");
            return this;
        }
        public GeneratedCriteria andIsPayIdIsNull() {
            addCriterion("IS_PAY_ID is null");
            return this;
        }

        public GeneratedCriteria andIsPayIdIsNotNull() {
            addCriterion("IS_PAY_ID is not null");
            return this;
        }

        public GeneratedCriteria andIsPayIdEqualTo(String value) {
            addCriterion("IS_PAY_ID =", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdNotEqualTo(String value) {
            addCriterion("IS_PAY_ID <>", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdGreaterThan(String value) {
            addCriterion("IS_PAY_ID >", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PAY_ID >=", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdLessThan(String value) {
            addCriterion("IS_PAY_ID <", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdLessThanOrEqualTo(String value) {
            addCriterion("IS_PAY_ID <=", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdLike(String value) {
            addCriterion("IS_PAY_ID like", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdNotLike(String value) {
            addCriterion("IS_PAY_ID not like", value, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdIn(List<String> values) {
            addCriterion("IS_PAY_ID in", values, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdNotIn(List<String> values) {
            addCriterion("IS_PAY_ID not in", values, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdBetween(String value1, String value2) {
            addCriterion("IS_PAY_ID between", value1, value2, "isPayId");
            return this;
        }

        public GeneratedCriteria andIsPayIdNotBetween(String value1, String value2) {
            addCriterion("IS_PAY_ID not between", value1, value2, "isPayId");
            return this;
        }
    }
}