package com.sinfusi.freedom.rm.example;

import com.sinfusi.freedom.core.example.AbstractCriteria;
import com.sinfusi.freedom.core.example.AbstractExample;

import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.List;

/**
 * rm_rentplantab_zl标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
public class RmRentplantabZlExample extends AbstractExample<RmRentplantabZlExample.GeneratedCriteria> {

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
        public GeneratedCriteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return this;
        }

        public GeneratedCriteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return this;
        }

        public GeneratedCriteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return this;
        }

        public GeneratedCriteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return this;
        }
        public GeneratedCriteria andRentSnIsNull() {
            addCriterion("RENT_SN is null");
            return this;
        }

        public GeneratedCriteria andRentSnIsNotNull() {
            addCriterion("RENT_SN is not null");
            return this;
        }

        public GeneratedCriteria andRentSnEqualTo(Integer value) {
            addCriterion("RENT_SN =", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnNotEqualTo(Integer value) {
            addCriterion("RENT_SN <>", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnGreaterThan(Integer value) {
            addCriterion("RENT_SN >", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnGreaterThanOrEqualTo(Integer value) {
            addCriterion("RENT_SN >=", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnLessThan(Integer value) {
            addCriterion("RENT_SN <", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnLessThanOrEqualTo(Integer value) {
            addCriterion("RENT_SN <=", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnLike(Integer value) {
            addCriterion("RENT_SN like", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnNotLike(Integer value) {
            addCriterion("RENT_SN not like", value, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnIn(List<Integer> values) {
            addCriterion("RENT_SN in", values, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnNotIn(List<Integer> values) {
            addCriterion("RENT_SN not in", values, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnBetween(Integer value1, Integer value2) {
            addCriterion("RENT_SN between", value1, value2, "rentSn");
            return this;
        }

        public GeneratedCriteria andRentSnNotBetween(Integer value1, Integer value2) {
            addCriterion("RENT_SN not between", value1, value2, "rentSn");
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
        public GeneratedCriteria andBrandCodeIdIsNull() {
            addCriterion("BRAND_CODE_ID is null");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdIsNotNull() {
            addCriterion("BRAND_CODE_ID is not null");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdEqualTo(String value) {
            addCriterion("BRAND_CODE_ID =", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdNotEqualTo(String value) {
            addCriterion("BRAND_CODE_ID <>", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdGreaterThan(String value) {
            addCriterion("BRAND_CODE_ID >", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE_ID >=", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdLessThan(String value) {
            addCriterion("BRAND_CODE_ID <", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdLessThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE_ID <=", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdLike(String value) {
            addCriterion("BRAND_CODE_ID like", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdNotLike(String value) {
            addCriterion("BRAND_CODE_ID not like", value, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdIn(List<String> values) {
            addCriterion("BRAND_CODE_ID in", values, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdNotIn(List<String> values) {
            addCriterion("BRAND_CODE_ID not in", values, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdBetween(String value1, String value2) {
            addCriterion("BRAND_CODE_ID between", value1, value2, "brandCodeId");
            return this;
        }

        public GeneratedCriteria andBrandCodeIdNotBetween(String value1, String value2) {
            addCriterion("BRAND_CODE_ID not between", value1, value2, "brandCodeId");
            return this;
        }
        public GeneratedCriteria andResoureCodeIdIsNull() {
            addCriterion("RESOURE_CODE_ID is null");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdIsNotNull() {
            addCriterion("RESOURE_CODE_ID is not null");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdEqualTo(String value) {
            addCriterion("RESOURE_CODE_ID =", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdNotEqualTo(String value) {
            addCriterion("RESOURE_CODE_ID <>", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdGreaterThan(String value) {
            addCriterion("RESOURE_CODE_ID >", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURE_CODE_ID >=", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdLessThan(String value) {
            addCriterion("RESOURE_CODE_ID <", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdLessThanOrEqualTo(String value) {
            addCriterion("RESOURE_CODE_ID <=", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdLike(String value) {
            addCriterion("RESOURE_CODE_ID like", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdNotLike(String value) {
            addCriterion("RESOURE_CODE_ID not like", value, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdIn(List<String> values) {
            addCriterion("RESOURE_CODE_ID in", values, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdNotIn(List<String> values) {
            addCriterion("RESOURE_CODE_ID not in", values, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdBetween(String value1, String value2) {
            addCriterion("RESOURE_CODE_ID between", value1, value2, "resoureCodeId");
            return this;
        }

        public GeneratedCriteria andResoureCodeIdNotBetween(String value1, String value2) {
            addCriterion("RESOURE_CODE_ID not between", value1, value2, "resoureCodeId");
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
        public GeneratedCriteria andAgentCodeIdIsNull() {
            addCriterion("AGENT_CODE_ID is null");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdIsNotNull() {
            addCriterion("AGENT_CODE_ID is not null");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdEqualTo(String value) {
            addCriterion("AGENT_CODE_ID =", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdNotEqualTo(String value) {
            addCriterion("AGENT_CODE_ID <>", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdGreaterThan(String value) {
            addCriterion("AGENT_CODE_ID >", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE_ID >=", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdLessThan(String value) {
            addCriterion("AGENT_CODE_ID <", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdLessThanOrEqualTo(String value) {
            addCriterion("AGENT_CODE_ID <=", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdLike(String value) {
            addCriterion("AGENT_CODE_ID like", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdNotLike(String value) {
            addCriterion("AGENT_CODE_ID not like", value, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdIn(List<String> values) {
            addCriterion("AGENT_CODE_ID in", values, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdNotIn(List<String> values) {
            addCriterion("AGENT_CODE_ID not in", values, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdBetween(String value1, String value2) {
            addCriterion("AGENT_CODE_ID between", value1, value2, "agentCodeId");
            return this;
        }

        public GeneratedCriteria andAgentCodeIdNotBetween(String value1, String value2) {
            addCriterion("AGENT_CODE_ID not between", value1, value2, "agentCodeId");
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
        public GeneratedCriteria andRentAmtIsNull() {
            addCriterion("RENT_AMT is null");
            return this;
        }

        public GeneratedCriteria andRentAmtIsNotNull() {
            addCriterion("RENT_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRentAmtEqualTo(BigDecimal value) {
            addCriterion("RENT_AMT =", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtNotEqualTo(BigDecimal value) {
            addCriterion("RENT_AMT <>", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtGreaterThan(BigDecimal value) {
            addCriterion("RENT_AMT >", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RENT_AMT >=", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtLessThan(BigDecimal value) {
            addCriterion("RENT_AMT <", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RENT_AMT <=", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtLike(BigDecimal value) {
            addCriterion("RENT_AMT like", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtNotLike(BigDecimal value) {
            addCriterion("RENT_AMT not like", value, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtIn(List<BigDecimal> values) {
            addCriterion("RENT_AMT in", values, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtNotIn(List<BigDecimal> values) {
            addCriterion("RENT_AMT not in", values, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENT_AMT between", value1, value2, "rentAmt");
            return this;
        }

        public GeneratedCriteria andRentAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RENT_AMT not between", value1, value2, "rentAmt");
            return this;
        }
        public GeneratedCriteria andRestRentAmtIsNull() {
            addCriterion("REST_RENT_AMT is null");
            return this;
        }

        public GeneratedCriteria andRestRentAmtIsNotNull() {
            addCriterion("REST_RENT_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRestRentAmtEqualTo(BigDecimal value) {
            addCriterion("REST_RENT_AMT =", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtNotEqualTo(BigDecimal value) {
            addCriterion("REST_RENT_AMT <>", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtGreaterThan(BigDecimal value) {
            addCriterion("REST_RENT_AMT >", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_RENT_AMT >=", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtLessThan(BigDecimal value) {
            addCriterion("REST_RENT_AMT <", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_RENT_AMT <=", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtLike(BigDecimal value) {
            addCriterion("REST_RENT_AMT like", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtNotLike(BigDecimal value) {
            addCriterion("REST_RENT_AMT not like", value, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtIn(List<BigDecimal> values) {
            addCriterion("REST_RENT_AMT in", values, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtNotIn(List<BigDecimal> values) {
            addCriterion("REST_RENT_AMT not in", values, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_RENT_AMT between", value1, value2, "restRentAmt");
            return this;
        }

        public GeneratedCriteria andRestRentAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_RENT_AMT not between", value1, value2, "restRentAmt");
            return this;
        }
        public GeneratedCriteria andCorAmtIsNull() {
            addCriterion("COR_AMT is null");
            return this;
        }

        public GeneratedCriteria andCorAmtIsNotNull() {
            addCriterion("COR_AMT is not null");
            return this;
        }

        public GeneratedCriteria andCorAmtEqualTo(BigDecimal value) {
            addCriterion("COR_AMT =", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtNotEqualTo(BigDecimal value) {
            addCriterion("COR_AMT <>", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtGreaterThan(BigDecimal value) {
            addCriterion("COR_AMT >", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COR_AMT >=", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtLessThan(BigDecimal value) {
            addCriterion("COR_AMT <", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COR_AMT <=", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtLike(BigDecimal value) {
            addCriterion("COR_AMT like", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtNotLike(BigDecimal value) {
            addCriterion("COR_AMT not like", value, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtIn(List<BigDecimal> values) {
            addCriterion("COR_AMT in", values, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtNotIn(List<BigDecimal> values) {
            addCriterion("COR_AMT not in", values, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COR_AMT between", value1, value2, "corAmt");
            return this;
        }

        public GeneratedCriteria andCorAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COR_AMT not between", value1, value2, "corAmt");
            return this;
        }
        public GeneratedCriteria andRestCorAmtIsNull() {
            addCriterion("REST_COR_AMT is null");
            return this;
        }

        public GeneratedCriteria andRestCorAmtIsNotNull() {
            addCriterion("REST_COR_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRestCorAmtEqualTo(BigDecimal value) {
            addCriterion("REST_COR_AMT =", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtNotEqualTo(BigDecimal value) {
            addCriterion("REST_COR_AMT <>", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtGreaterThan(BigDecimal value) {
            addCriterion("REST_COR_AMT >", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_COR_AMT >=", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtLessThan(BigDecimal value) {
            addCriterion("REST_COR_AMT <", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_COR_AMT <=", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtLike(BigDecimal value) {
            addCriterion("REST_COR_AMT like", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtNotLike(BigDecimal value) {
            addCriterion("REST_COR_AMT not like", value, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtIn(List<BigDecimal> values) {
            addCriterion("REST_COR_AMT in", values, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtNotIn(List<BigDecimal> values) {
            addCriterion("REST_COR_AMT not in", values, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_COR_AMT between", value1, value2, "restCorAmt");
            return this;
        }

        public GeneratedCriteria andRestCorAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_COR_AMT not between", value1, value2, "restCorAmt");
            return this;
        }
        public GeneratedCriteria andIntAmtIsNull() {
            addCriterion("INT_AMT is null");
            return this;
        }

        public GeneratedCriteria andIntAmtIsNotNull() {
            addCriterion("INT_AMT is not null");
            return this;
        }

        public GeneratedCriteria andIntAmtEqualTo(BigDecimal value) {
            addCriterion("INT_AMT =", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtNotEqualTo(BigDecimal value) {
            addCriterion("INT_AMT <>", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtGreaterThan(BigDecimal value) {
            addCriterion("INT_AMT >", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_AMT >=", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtLessThan(BigDecimal value) {
            addCriterion("INT_AMT <", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_AMT <=", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtLike(BigDecimal value) {
            addCriterion("INT_AMT like", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtNotLike(BigDecimal value) {
            addCriterion("INT_AMT not like", value, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtIn(List<BigDecimal> values) {
            addCriterion("INT_AMT in", values, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtNotIn(List<BigDecimal> values) {
            addCriterion("INT_AMT not in", values, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_AMT between", value1, value2, "intAmt");
            return this;
        }

        public GeneratedCriteria andIntAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_AMT not between", value1, value2, "intAmt");
            return this;
        }
        public GeneratedCriteria andRestIntAmtIsNull() {
            addCriterion("REST_INT_AMT is null");
            return this;
        }

        public GeneratedCriteria andRestIntAmtIsNotNull() {
            addCriterion("REST_INT_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRestIntAmtEqualTo(BigDecimal value) {
            addCriterion("REST_INT_AMT =", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtNotEqualTo(BigDecimal value) {
            addCriterion("REST_INT_AMT <>", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtGreaterThan(BigDecimal value) {
            addCriterion("REST_INT_AMT >", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_INT_AMT >=", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtLessThan(BigDecimal value) {
            addCriterion("REST_INT_AMT <", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REST_INT_AMT <=", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtLike(BigDecimal value) {
            addCriterion("REST_INT_AMT like", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtNotLike(BigDecimal value) {
            addCriterion("REST_INT_AMT not like", value, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtIn(List<BigDecimal> values) {
            addCriterion("REST_INT_AMT in", values, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtNotIn(List<BigDecimal> values) {
            addCriterion("REST_INT_AMT not in", values, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_INT_AMT between", value1, value2, "restIntAmt");
            return this;
        }

        public GeneratedCriteria andRestIntAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REST_INT_AMT not between", value1, value2, "restIntAmt");
            return this;
        }
        public GeneratedCriteria andPrinblAmtIsNull() {
            addCriterion("PRINBL_AMT is null");
            return this;
        }

        public GeneratedCriteria andPrinblAmtIsNotNull() {
            addCriterion("PRINBL_AMT is not null");
            return this;
        }

        public GeneratedCriteria andPrinblAmtEqualTo(BigDecimal value) {
            addCriterion("PRINBL_AMT =", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtNotEqualTo(BigDecimal value) {
            addCriterion("PRINBL_AMT <>", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtGreaterThan(BigDecimal value) {
            addCriterion("PRINBL_AMT >", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINBL_AMT >=", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtLessThan(BigDecimal value) {
            addCriterion("PRINBL_AMT <", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRINBL_AMT <=", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtLike(BigDecimal value) {
            addCriterion("PRINBL_AMT like", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtNotLike(BigDecimal value) {
            addCriterion("PRINBL_AMT not like", value, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtIn(List<BigDecimal> values) {
            addCriterion("PRINBL_AMT in", values, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtNotIn(List<BigDecimal> values) {
            addCriterion("PRINBL_AMT not in", values, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINBL_AMT between", value1, value2, "prinblAmt");
            return this;
        }

        public GeneratedCriteria andPrinblAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRINBL_AMT not between", value1, value2, "prinblAmt");
            return this;
        }
        public GeneratedCriteria andPlanPenAmtIsNull() {
            addCriterion("PLAN_PEN_AMT is null");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtIsNotNull() {
            addCriterion("PLAN_PEN_AMT is not null");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtEqualTo(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT =", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtNotEqualTo(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT <>", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtGreaterThan(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT >", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT >=", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtLessThan(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT <", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT <=", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtLike(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT like", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtNotLike(BigDecimal value) {
            addCriterion("PLAN_PEN_AMT not like", value, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtIn(List<BigDecimal> values) {
            addCriterion("PLAN_PEN_AMT in", values, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtNotIn(List<BigDecimal> values) {
            addCriterion("PLAN_PEN_AMT not in", values, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_PEN_AMT between", value1, value2, "planPenAmt");
            return this;
        }

        public GeneratedCriteria andPlanPenAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLAN_PEN_AMT not between", value1, value2, "planPenAmt");
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
        public GeneratedCriteria andRedPenAmtIsNull() {
            addCriterion("RED_PEN_AMT is null");
            return this;
        }

        public GeneratedCriteria andRedPenAmtIsNotNull() {
            addCriterion("RED_PEN_AMT is not null");
            return this;
        }

        public GeneratedCriteria andRedPenAmtEqualTo(BigDecimal value) {
            addCriterion("RED_PEN_AMT =", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtNotEqualTo(BigDecimal value) {
            addCriterion("RED_PEN_AMT <>", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtGreaterThan(BigDecimal value) {
            addCriterion("RED_PEN_AMT >", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RED_PEN_AMT >=", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtLessThan(BigDecimal value) {
            addCriterion("RED_PEN_AMT <", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RED_PEN_AMT <=", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtLike(BigDecimal value) {
            addCriterion("RED_PEN_AMT like", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtNotLike(BigDecimal value) {
            addCriterion("RED_PEN_AMT not like", value, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtIn(List<BigDecimal> values) {
            addCriterion("RED_PEN_AMT in", values, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtNotIn(List<BigDecimal> values) {
            addCriterion("RED_PEN_AMT not in", values, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RED_PEN_AMT between", value1, value2, "redPenAmt");
            return this;
        }

        public GeneratedCriteria andRedPenAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RED_PEN_AMT not between", value1, value2, "redPenAmt");
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
        public GeneratedCriteria andYearRateIsNull() {
            addCriterion("YEAR_RATE is null");
            return this;
        }

        public GeneratedCriteria andYearRateIsNotNull() {
            addCriterion("YEAR_RATE is not null");
            return this;
        }

        public GeneratedCriteria andYearRateEqualTo(BigDecimal value) {
            addCriterion("YEAR_RATE =", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateNotEqualTo(BigDecimal value) {
            addCriterion("YEAR_RATE <>", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateGreaterThan(BigDecimal value) {
            addCriterion("YEAR_RATE >", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_RATE >=", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateLessThan(BigDecimal value) {
            addCriterion("YEAR_RATE <", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_RATE <=", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateLike(BigDecimal value) {
            addCriterion("YEAR_RATE like", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateNotLike(BigDecimal value) {
            addCriterion("YEAR_RATE not like", value, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateIn(List<BigDecimal> values) {
            addCriterion("YEAR_RATE in", values, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateNotIn(List<BigDecimal> values) {
            addCriterion("YEAR_RATE not in", values, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_RATE between", value1, value2, "yearRate");
            return this;
        }

        public GeneratedCriteria andYearRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_RATE not between", value1, value2, "yearRate");
            return this;
        }
        public GeneratedCriteria andNperAteIsNull() {
            addCriterion("NPER_ATE is null");
            return this;
        }

        public GeneratedCriteria andNperAteIsNotNull() {
            addCriterion("NPER_ATE is not null");
            return this;
        }

        public GeneratedCriteria andNperAteEqualTo(BigDecimal value) {
            addCriterion("NPER_ATE =", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteNotEqualTo(BigDecimal value) {
            addCriterion("NPER_ATE <>", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteGreaterThan(BigDecimal value) {
            addCriterion("NPER_ATE >", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NPER_ATE >=", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteLessThan(BigDecimal value) {
            addCriterion("NPER_ATE <", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NPER_ATE <=", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteLike(BigDecimal value) {
            addCriterion("NPER_ATE like", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteNotLike(BigDecimal value) {
            addCriterion("NPER_ATE not like", value, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteIn(List<BigDecimal> values) {
            addCriterion("NPER_ATE in", values, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteNotIn(List<BigDecimal> values) {
            addCriterion("NPER_ATE not in", values, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NPER_ATE between", value1, value2, "nperAte");
            return this;
        }

        public GeneratedCriteria andNperAteNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NPER_ATE not between", value1, value2, "nperAte");
            return this;
        }
        public GeneratedCriteria andLvDaysIsNull() {
            addCriterion("LV_DAYS is null");
            return this;
        }

        public GeneratedCriteria andLvDaysIsNotNull() {
            addCriterion("LV_DAYS is not null");
            return this;
        }

        public GeneratedCriteria andLvDaysEqualTo(Integer value) {
            addCriterion("LV_DAYS =", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysNotEqualTo(Integer value) {
            addCriterion("LV_DAYS <>", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysGreaterThan(Integer value) {
            addCriterion("LV_DAYS >", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("LV_DAYS >=", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysLessThan(Integer value) {
            addCriterion("LV_DAYS <", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysLessThanOrEqualTo(Integer value) {
            addCriterion("LV_DAYS <=", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysLike(Integer value) {
            addCriterion("LV_DAYS like", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysNotLike(Integer value) {
            addCriterion("LV_DAYS not like", value, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysIn(List<Integer> values) {
            addCriterion("LV_DAYS in", values, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysNotIn(List<Integer> values) {
            addCriterion("LV_DAYS not in", values, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysBetween(Integer value1, Integer value2) {
            addCriterion("LV_DAYS between", value1, value2, "lvDays");
            return this;
        }

        public GeneratedCriteria andLvDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("LV_DAYS not between", value1, value2, "lvDays");
            return this;
        }
        public GeneratedCriteria andAdjretDateIsNull() {
            addCriterion("ADJRET_DATE is null");
            return this;
        }

        public GeneratedCriteria andAdjretDateIsNotNull() {
            addCriterion("ADJRET_DATE is not null");
            return this;
        }

        public GeneratedCriteria andAdjretDateEqualTo(LocalDate value) {
            addCriterion("ADJRET_DATE =", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateNotEqualTo(LocalDate value) {
            addCriterion("ADJRET_DATE <>", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateGreaterThan(LocalDate value) {
            addCriterion("ADJRET_DATE >", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("ADJRET_DATE >=", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateLessThan(LocalDate value) {
            addCriterion("ADJRET_DATE <", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("ADJRET_DATE <=", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateLike(LocalDate value) {
            addCriterion("ADJRET_DATE like", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateNotLike(LocalDate value) {
            addCriterion("ADJRET_DATE not like", value, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateIn(List<LocalDate> values) {
            addCriterion("ADJRET_DATE in", values, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateNotIn(List<LocalDate> values) {
            addCriterion("ADJRET_DATE not in", values, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("ADJRET_DATE between", value1, value2, "adjretDate");
            return this;
        }

        public GeneratedCriteria andAdjretDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("ADJRET_DATE not between", value1, value2, "adjretDate");
            return this;
        }
        public GeneratedCriteria andAdjCalDaysIsNull() {
            addCriterion("ADJ_CAL_DAYS is null");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysIsNotNull() {
            addCriterion("ADJ_CAL_DAYS is not null");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysEqualTo(Integer value) {
            addCriterion("ADJ_CAL_DAYS =", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysNotEqualTo(Integer value) {
            addCriterion("ADJ_CAL_DAYS <>", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysGreaterThan(Integer value) {
            addCriterion("ADJ_CAL_DAYS >", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADJ_CAL_DAYS >=", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysLessThan(Integer value) {
            addCriterion("ADJ_CAL_DAYS <", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysLessThanOrEqualTo(Integer value) {
            addCriterion("ADJ_CAL_DAYS <=", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysLike(Integer value) {
            addCriterion("ADJ_CAL_DAYS like", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysNotLike(Integer value) {
            addCriterion("ADJ_CAL_DAYS not like", value, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysIn(List<Integer> values) {
            addCriterion("ADJ_CAL_DAYS in", values, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysNotIn(List<Integer> values) {
            addCriterion("ADJ_CAL_DAYS not in", values, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysBetween(Integer value1, Integer value2) {
            addCriterion("ADJ_CAL_DAYS between", value1, value2, "adjCalDays");
            return this;
        }

        public GeneratedCriteria andAdjCalDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ADJ_CAL_DAYS not between", value1, value2, "adjCalDays");
            return this;
        }
        public GeneratedCriteria andRentStateIdIsNull() {
            addCriterion("RENT_STATE_ID is null");
            return this;
        }

        public GeneratedCriteria andRentStateIdIsNotNull() {
            addCriterion("RENT_STATE_ID is not null");
            return this;
        }

        public GeneratedCriteria andRentStateIdEqualTo(String value) {
            addCriterion("RENT_STATE_ID =", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdNotEqualTo(String value) {
            addCriterion("RENT_STATE_ID <>", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdGreaterThan(String value) {
            addCriterion("RENT_STATE_ID >", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("RENT_STATE_ID >=", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdLessThan(String value) {
            addCriterion("RENT_STATE_ID <", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdLessThanOrEqualTo(String value) {
            addCriterion("RENT_STATE_ID <=", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdLike(String value) {
            addCriterion("RENT_STATE_ID like", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdNotLike(String value) {
            addCriterion("RENT_STATE_ID not like", value, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdIn(List<String> values) {
            addCriterion("RENT_STATE_ID in", values, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdNotIn(List<String> values) {
            addCriterion("RENT_STATE_ID not in", values, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdBetween(String value1, String value2) {
            addCriterion("RENT_STATE_ID between", value1, value2, "rentStateId");
            return this;
        }

        public GeneratedCriteria andRentStateIdNotBetween(String value1, String value2) {
            addCriterion("RENT_STATE_ID not between", value1, value2, "rentStateId");
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
        public GeneratedCriteria andPayWayIdIsNull() {
            addCriterion("PAY_WAY_ID is null");
            return this;
        }

        public GeneratedCriteria andPayWayIdIsNotNull() {
            addCriterion("PAY_WAY_ID is not null");
            return this;
        }

        public GeneratedCriteria andPayWayIdEqualTo(String value) {
            addCriterion("PAY_WAY_ID =", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdNotEqualTo(String value) {
            addCriterion("PAY_WAY_ID <>", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdGreaterThan(String value) {
            addCriterion("PAY_WAY_ID >", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_ID >=", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdLessThan(String value) {
            addCriterion("PAY_WAY_ID <", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY_ID <=", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdLike(String value) {
            addCriterion("PAY_WAY_ID like", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdNotLike(String value) {
            addCriterion("PAY_WAY_ID not like", value, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdIn(List<String> values) {
            addCriterion("PAY_WAY_ID in", values, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdNotIn(List<String> values) {
            addCriterion("PAY_WAY_ID not in", values, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdBetween(String value1, String value2) {
            addCriterion("PAY_WAY_ID between", value1, value2, "payWayId");
            return this;
        }

        public GeneratedCriteria andPayWayIdNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY_ID not between", value1, value2, "payWayId");
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
        public GeneratedCriteria andStatusIdIsNull() {
            addCriterion("STATUS_ID is null");
            return this;
        }

        public GeneratedCriteria andStatusIdIsNotNull() {
            addCriterion("STATUS_ID is not null");
            return this;
        }

        public GeneratedCriteria andStatusIdEqualTo(String value) {
            addCriterion("STATUS_ID =", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdNotEqualTo(String value) {
            addCriterion("STATUS_ID <>", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdGreaterThan(String value) {
            addCriterion("STATUS_ID >", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_ID >=", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdLessThan(String value) {
            addCriterion("STATUS_ID <", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("STATUS_ID <=", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdLike(String value) {
            addCriterion("STATUS_ID like", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdNotLike(String value) {
            addCriterion("STATUS_ID not like", value, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdIn(List<String> values) {
            addCriterion("STATUS_ID in", values, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdNotIn(List<String> values) {
            addCriterion("STATUS_ID not in", values, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdBetween(String value1, String value2) {
            addCriterion("STATUS_ID between", value1, value2, "statusId");
            return this;
        }

        public GeneratedCriteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("STATUS_ID not between", value1, value2, "statusId");
            return this;
        }
        public GeneratedCriteria andOverDaysIsNull() {
            addCriterion("OVER_DAYS is null");
            return this;
        }

        public GeneratedCriteria andOverDaysIsNotNull() {
            addCriterion("OVER_DAYS is not null");
            return this;
        }

        public GeneratedCriteria andOverDaysEqualTo(Integer value) {
            addCriterion("OVER_DAYS =", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysNotEqualTo(Integer value) {
            addCriterion("OVER_DAYS <>", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysGreaterThan(Integer value) {
            addCriterion("OVER_DAYS >", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVER_DAYS >=", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysLessThan(Integer value) {
            addCriterion("OVER_DAYS <", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysLessThanOrEqualTo(Integer value) {
            addCriterion("OVER_DAYS <=", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysLike(Integer value) {
            addCriterion("OVER_DAYS like", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysNotLike(Integer value) {
            addCriterion("OVER_DAYS not like", value, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysIn(List<Integer> values) {
            addCriterion("OVER_DAYS in", values, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysNotIn(List<Integer> values) {
            addCriterion("OVER_DAYS not in", values, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysBetween(Integer value1, Integer value2) {
            addCriterion("OVER_DAYS between", value1, value2, "overDays");
            return this;
        }

        public GeneratedCriteria andOverDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("OVER_DAYS not between", value1, value2, "overDays");
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
    }
}