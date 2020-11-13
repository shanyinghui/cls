package com.sinfusi.freedom.rm.example;

import com.sinfusi.freedom.core.example.AbstractCriteria;
import com.sinfusi.freedom.core.example.AbstractExample;

import java.math.BigDecimal;
import java.util.List;

/**
 * rm_ebankdeduct_det标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
public class RmEbankdeductDetExample extends AbstractExample<RmEbankdeductDetExample.GeneratedCriteria> {

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
        public GeneratedCriteria andWaterIdIsNull() {
            addCriterion("WATER_ID is null");
            return this;
        }

        public GeneratedCriteria andWaterIdIsNotNull() {
            addCriterion("WATER_ID is not null");
            return this;
        }

        public GeneratedCriteria andWaterIdEqualTo(String value) {
            addCriterion("WATER_ID =", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdNotEqualTo(String value) {
            addCriterion("WATER_ID <>", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdGreaterThan(String value) {
            addCriterion("WATER_ID >", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("WATER_ID >=", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdLessThan(String value) {
            addCriterion("WATER_ID <", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdLessThanOrEqualTo(String value) {
            addCriterion("WATER_ID <=", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdLike(String value) {
            addCriterion("WATER_ID like", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdNotLike(String value) {
            addCriterion("WATER_ID not like", value, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdIn(List<String> values) {
            addCriterion("WATER_ID in", values, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdNotIn(List<String> values) {
            addCriterion("WATER_ID not in", values, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdBetween(String value1, String value2) {
            addCriterion("WATER_ID between", value1, value2, "waterId");
            return this;
        }

        public GeneratedCriteria andWaterIdNotBetween(String value1, String value2) {
            addCriterion("WATER_ID not between", value1, value2, "waterId");
            return this;
        }
        public GeneratedCriteria andRelIdIsNull() {
            addCriterion("REL_ID is null");
            return this;
        }

        public GeneratedCriteria andRelIdIsNotNull() {
            addCriterion("REL_ID is not null");
            return this;
        }

        public GeneratedCriteria andRelIdEqualTo(String value) {
            addCriterion("REL_ID =", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdNotEqualTo(String value) {
            addCriterion("REL_ID <>", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdGreaterThan(String value) {
            addCriterion("REL_ID >", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdGreaterThanOrEqualTo(String value) {
            addCriterion("REL_ID >=", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdLessThan(String value) {
            addCriterion("REL_ID <", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdLessThanOrEqualTo(String value) {
            addCriterion("REL_ID <=", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdLike(String value) {
            addCriterion("REL_ID like", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdNotLike(String value) {
            addCriterion("REL_ID not like", value, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdIn(List<String> values) {
            addCriterion("REL_ID in", values, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdNotIn(List<String> values) {
            addCriterion("REL_ID not in", values, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdBetween(String value1, String value2) {
            addCriterion("REL_ID between", value1, value2, "relId");
            return this;
        }

        public GeneratedCriteria andRelIdNotBetween(String value1, String value2) {
            addCriterion("REL_ID not between", value1, value2, "relId");
            return this;
        }
        public GeneratedCriteria andRetamtTypeIdIsNull() {
            addCriterion("RETAMT_TYPE_ID is null");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdIsNotNull() {
            addCriterion("RETAMT_TYPE_ID is not null");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdEqualTo(String value) {
            addCriterion("RETAMT_TYPE_ID =", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdNotEqualTo(String value) {
            addCriterion("RETAMT_TYPE_ID <>", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdGreaterThan(String value) {
            addCriterion("RETAMT_TYPE_ID >", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RETAMT_TYPE_ID >=", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdLessThan(String value) {
            addCriterion("RETAMT_TYPE_ID <", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdLessThanOrEqualTo(String value) {
            addCriterion("RETAMT_TYPE_ID <=", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdLike(String value) {
            addCriterion("RETAMT_TYPE_ID like", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdNotLike(String value) {
            addCriterion("RETAMT_TYPE_ID not like", value, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdIn(List<String> values) {
            addCriterion("RETAMT_TYPE_ID in", values, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdNotIn(List<String> values) {
            addCriterion("RETAMT_TYPE_ID not in", values, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdBetween(String value1, String value2) {
            addCriterion("RETAMT_TYPE_ID between", value1, value2, "retamtTypeId");
            return this;
        }

        public GeneratedCriteria andRetamtTypeIdNotBetween(String value1, String value2) {
            addCriterion("RETAMT_TYPE_ID not between", value1, value2, "retamtTypeId");
            return this;
        }
        public GeneratedCriteria andPayNoIsNull() {
            addCriterion("PAY_NO is null");
            return this;
        }

        public GeneratedCriteria andPayNoIsNotNull() {
            addCriterion("PAY_NO is not null");
            return this;
        }

        public GeneratedCriteria andPayNoEqualTo(String value) {
            addCriterion("PAY_NO =", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoNotEqualTo(String value) {
            addCriterion("PAY_NO <>", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoGreaterThan(String value) {
            addCriterion("PAY_NO >", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NO >=", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoLessThan(String value) {
            addCriterion("PAY_NO <", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_NO <=", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoLike(String value) {
            addCriterion("PAY_NO like", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoNotLike(String value) {
            addCriterion("PAY_NO not like", value, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoIn(List<String> values) {
            addCriterion("PAY_NO in", values, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoNotIn(List<String> values) {
            addCriterion("PAY_NO not in", values, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoBetween(String value1, String value2) {
            addCriterion("PAY_NO between", value1, value2, "payNo");
            return this;
        }

        public GeneratedCriteria andPayNoNotBetween(String value1, String value2) {
            addCriterion("PAY_NO not between", value1, value2, "payNo");
            return this;
        }
        public GeneratedCriteria andDealNoIsNull() {
            addCriterion("DEAL_NO is null");
            return this;
        }

        public GeneratedCriteria andDealNoIsNotNull() {
            addCriterion("DEAL_NO is not null");
            return this;
        }

        public GeneratedCriteria andDealNoEqualTo(String value) {
            addCriterion("DEAL_NO =", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoNotEqualTo(String value) {
            addCriterion("DEAL_NO <>", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoGreaterThan(String value) {
            addCriterion("DEAL_NO >", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_NO >=", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoLessThan(String value) {
            addCriterion("DEAL_NO <", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoLessThanOrEqualTo(String value) {
            addCriterion("DEAL_NO <=", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoLike(String value) {
            addCriterion("DEAL_NO like", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoNotLike(String value) {
            addCriterion("DEAL_NO not like", value, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoIn(List<String> values) {
            addCriterion("DEAL_NO in", values, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoNotIn(List<String> values) {
            addCriterion("DEAL_NO not in", values, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoBetween(String value1, String value2) {
            addCriterion("DEAL_NO between", value1, value2, "dealNo");
            return this;
        }

        public GeneratedCriteria andDealNoNotBetween(String value1, String value2) {
            addCriterion("DEAL_NO not between", value1, value2, "dealNo");
            return this;
        }
        public GeneratedCriteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return this;
        }

        public GeneratedCriteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return this;
        }

        public GeneratedCriteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return this;
        }

        public GeneratedCriteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return this;
        }
        public GeneratedCriteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return this;
        }

        public GeneratedCriteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return this;
        }

        public GeneratedCriteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return this;
        }

        public GeneratedCriteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return this;
        }

        public GeneratedCriteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return this;
        }

        public GeneratedCriteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return this;
        }

        public GeneratedCriteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return this;
        }
        public GeneratedCriteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return this;
        }

        public GeneratedCriteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return this;
        }

        public GeneratedCriteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return this;
        }

        public GeneratedCriteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
            return this;
        }
        public GeneratedCriteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return this;
        }

        public GeneratedCriteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return this;
        }

        public GeneratedCriteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return this;
        }

        public GeneratedCriteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return this;
        }
        public GeneratedCriteria andRecBankIsNull() {
            addCriterion("REC_BANK is null");
            return this;
        }

        public GeneratedCriteria andRecBankIsNotNull() {
            addCriterion("REC_BANK is not null");
            return this;
        }

        public GeneratedCriteria andRecBankEqualTo(String value) {
            addCriterion("REC_BANK =", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankNotEqualTo(String value) {
            addCriterion("REC_BANK <>", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankGreaterThan(String value) {
            addCriterion("REC_BANK >", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankGreaterThanOrEqualTo(String value) {
            addCriterion("REC_BANK >=", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankLessThan(String value) {
            addCriterion("REC_BANK <", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankLessThanOrEqualTo(String value) {
            addCriterion("REC_BANK <=", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankLike(String value) {
            addCriterion("REC_BANK like", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankNotLike(String value) {
            addCriterion("REC_BANK not like", value, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankIn(List<String> values) {
            addCriterion("REC_BANK in", values, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankNotIn(List<String> values) {
            addCriterion("REC_BANK not in", values, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankBetween(String value1, String value2) {
            addCriterion("REC_BANK between", value1, value2, "recBank");
            return this;
        }

        public GeneratedCriteria andRecBankNotBetween(String value1, String value2) {
            addCriterion("REC_BANK not between", value1, value2, "recBank");
            return this;
        }
        public GeneratedCriteria andRecAcctIsNull() {
            addCriterion("REC_ACCT is null");
            return this;
        }

        public GeneratedCriteria andRecAcctIsNotNull() {
            addCriterion("REC_ACCT is not null");
            return this;
        }

        public GeneratedCriteria andRecAcctEqualTo(String value) {
            addCriterion("REC_ACCT =", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctNotEqualTo(String value) {
            addCriterion("REC_ACCT <>", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctGreaterThan(String value) {
            addCriterion("REC_ACCT >", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctGreaterThanOrEqualTo(String value) {
            addCriterion("REC_ACCT >=", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctLessThan(String value) {
            addCriterion("REC_ACCT <", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctLessThanOrEqualTo(String value) {
            addCriterion("REC_ACCT <=", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctLike(String value) {
            addCriterion("REC_ACCT like", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctNotLike(String value) {
            addCriterion("REC_ACCT not like", value, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctIn(List<String> values) {
            addCriterion("REC_ACCT in", values, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctNotIn(List<String> values) {
            addCriterion("REC_ACCT not in", values, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctBetween(String value1, String value2) {
            addCriterion("REC_ACCT between", value1, value2, "recAcct");
            return this;
        }

        public GeneratedCriteria andRecAcctNotBetween(String value1, String value2) {
            addCriterion("REC_ACCT not between", value1, value2, "recAcct");
            return this;
        }
        public GeneratedCriteria andRecUnitIsNull() {
            addCriterion("REC_UNIT is null");
            return this;
        }

        public GeneratedCriteria andRecUnitIsNotNull() {
            addCriterion("REC_UNIT is not null");
            return this;
        }

        public GeneratedCriteria andRecUnitEqualTo(String value) {
            addCriterion("REC_UNIT =", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitNotEqualTo(String value) {
            addCriterion("REC_UNIT <>", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitGreaterThan(String value) {
            addCriterion("REC_UNIT >", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitGreaterThanOrEqualTo(String value) {
            addCriterion("REC_UNIT >=", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitLessThan(String value) {
            addCriterion("REC_UNIT <", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitLessThanOrEqualTo(String value) {
            addCriterion("REC_UNIT <=", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitLike(String value) {
            addCriterion("REC_UNIT like", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitNotLike(String value) {
            addCriterion("REC_UNIT not like", value, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitIn(List<String> values) {
            addCriterion("REC_UNIT in", values, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitNotIn(List<String> values) {
            addCriterion("REC_UNIT not in", values, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitBetween(String value1, String value2) {
            addCriterion("REC_UNIT between", value1, value2, "recUnit");
            return this;
        }

        public GeneratedCriteria andRecUnitNotBetween(String value1, String value2) {
            addCriterion("REC_UNIT not between", value1, value2, "recUnit");
            return this;
        }
        public GeneratedCriteria andPayBankIsNull() {
            addCriterion("PAY_BANK is null");
            return this;
        }

        public GeneratedCriteria andPayBankIsNotNull() {
            addCriterion("PAY_BANK is not null");
            return this;
        }

        public GeneratedCriteria andPayBankEqualTo(String value) {
            addCriterion("PAY_BANK =", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankNotEqualTo(String value) {
            addCriterion("PAY_BANK <>", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankGreaterThan(String value) {
            addCriterion("PAY_BANK >", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_BANK >=", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankLessThan(String value) {
            addCriterion("PAY_BANK <", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankLessThanOrEqualTo(String value) {
            addCriterion("PAY_BANK <=", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankLike(String value) {
            addCriterion("PAY_BANK like", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankNotLike(String value) {
            addCriterion("PAY_BANK not like", value, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankIn(List<String> values) {
            addCriterion("PAY_BANK in", values, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankNotIn(List<String> values) {
            addCriterion("PAY_BANK not in", values, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankBetween(String value1, String value2) {
            addCriterion("PAY_BANK between", value1, value2, "payBank");
            return this;
        }

        public GeneratedCriteria andPayBankNotBetween(String value1, String value2) {
            addCriterion("PAY_BANK not between", value1, value2, "payBank");
            return this;
        }
        public GeneratedCriteria andPayAcctIsNull() {
            addCriterion("PAY_ACCT is null");
            return this;
        }

        public GeneratedCriteria andPayAcctIsNotNull() {
            addCriterion("PAY_ACCT is not null");
            return this;
        }

        public GeneratedCriteria andPayAcctEqualTo(String value) {
            addCriterion("PAY_ACCT =", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctNotEqualTo(String value) {
            addCriterion("PAY_ACCT <>", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctGreaterThan(String value) {
            addCriterion("PAY_ACCT >", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT >=", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctLessThan(String value) {
            addCriterion("PAY_ACCT <", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctLessThanOrEqualTo(String value) {
            addCriterion("PAY_ACCT <=", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctLike(String value) {
            addCriterion("PAY_ACCT like", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctNotLike(String value) {
            addCriterion("PAY_ACCT not like", value, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctIn(List<String> values) {
            addCriterion("PAY_ACCT in", values, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctNotIn(List<String> values) {
            addCriterion("PAY_ACCT not in", values, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctBetween(String value1, String value2) {
            addCriterion("PAY_ACCT between", value1, value2, "payAcct");
            return this;
        }

        public GeneratedCriteria andPayAcctNotBetween(String value1, String value2) {
            addCriterion("PAY_ACCT not between", value1, value2, "payAcct");
            return this;
        }
        public GeneratedCriteria andPayNameIsNull() {
            addCriterion("PAY_NAME is null");
            return this;
        }

        public GeneratedCriteria andPayNameIsNotNull() {
            addCriterion("PAY_NAME is not null");
            return this;
        }

        public GeneratedCriteria andPayNameEqualTo(String value) {
            addCriterion("PAY_NAME =", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameNotEqualTo(String value) {
            addCriterion("PAY_NAME <>", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameGreaterThan(String value) {
            addCriterion("PAY_NAME >", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NAME >=", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameLessThan(String value) {
            addCriterion("PAY_NAME <", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameLessThanOrEqualTo(String value) {
            addCriterion("PAY_NAME <=", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameLike(String value) {
            addCriterion("PAY_NAME like", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameNotLike(String value) {
            addCriterion("PAY_NAME not like", value, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameIn(List<String> values) {
            addCriterion("PAY_NAME in", values, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameNotIn(List<String> values) {
            addCriterion("PAY_NAME not in", values, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameBetween(String value1, String value2) {
            addCriterion("PAY_NAME between", value1, value2, "payName");
            return this;
        }

        public GeneratedCriteria andPayNameNotBetween(String value1, String value2) {
            addCriterion("PAY_NAME not between", value1, value2, "payName");
            return this;
        }
        public GeneratedCriteria andPayBankNoIsNull() {
            addCriterion("PAY_BANK_NO is null");
            return this;
        }

        public GeneratedCriteria andPayBankNoIsNotNull() {
            addCriterion("PAY_BANK_NO is not null");
            return this;
        }

        public GeneratedCriteria andPayBankNoEqualTo(String value) {
            addCriterion("PAY_BANK_NO =", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoNotEqualTo(String value) {
            addCriterion("PAY_BANK_NO <>", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoGreaterThan(String value) {
            addCriterion("PAY_BANK_NO >", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_BANK_NO >=", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoLessThan(String value) {
            addCriterion("PAY_BANK_NO <", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_BANK_NO <=", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoLike(String value) {
            addCriterion("PAY_BANK_NO like", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoNotLike(String value) {
            addCriterion("PAY_BANK_NO not like", value, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoIn(List<String> values) {
            addCriterion("PAY_BANK_NO in", values, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoNotIn(List<String> values) {
            addCriterion("PAY_BANK_NO not in", values, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoBetween(String value1, String value2) {
            addCriterion("PAY_BANK_NO between", value1, value2, "payBankNo");
            return this;
        }

        public GeneratedCriteria andPayBankNoNotBetween(String value1, String value2) {
            addCriterion("PAY_BANK_NO not between", value1, value2, "payBankNo");
            return this;
        }
        public GeneratedCriteria andIcbcIdIsNull() {
            addCriterion("ICBC_ID is null");
            return this;
        }

        public GeneratedCriteria andIcbcIdIsNotNull() {
            addCriterion("ICBC_ID is not null");
            return this;
        }

        public GeneratedCriteria andIcbcIdEqualTo(String value) {
            addCriterion("ICBC_ID =", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdNotEqualTo(String value) {
            addCriterion("ICBC_ID <>", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdGreaterThan(String value) {
            addCriterion("ICBC_ID >", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdGreaterThanOrEqualTo(String value) {
            addCriterion("ICBC_ID >=", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdLessThan(String value) {
            addCriterion("ICBC_ID <", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdLessThanOrEqualTo(String value) {
            addCriterion("ICBC_ID <=", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdLike(String value) {
            addCriterion("ICBC_ID like", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdNotLike(String value) {
            addCriterion("ICBC_ID not like", value, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdIn(List<String> values) {
            addCriterion("ICBC_ID in", values, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdNotIn(List<String> values) {
            addCriterion("ICBC_ID not in", values, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdBetween(String value1, String value2) {
            addCriterion("ICBC_ID between", value1, value2, "icbcId");
            return this;
        }

        public GeneratedCriteria andIcbcIdNotBetween(String value1, String value2) {
            addCriterion("ICBC_ID not between", value1, value2, "icbcId");
            return this;
        }
        public GeneratedCriteria andPayAmtIsNull() {
            addCriterion("PAY_AMT is null");
            return this;
        }

        public GeneratedCriteria andPayAmtIsNotNull() {
            addCriterion("PAY_AMT is not null");
            return this;
        }

        public GeneratedCriteria andPayAmtEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT =", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtNotEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <>", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtGreaterThan(BigDecimal value) {
            addCriterion("PAY_AMT >", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT >=", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtLessThan(BigDecimal value) {
            addCriterion("PAY_AMT <", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_AMT <=", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtLike(BigDecimal value) {
            addCriterion("PAY_AMT like", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtNotLike(BigDecimal value) {
            addCriterion("PAY_AMT not like", value, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT in", values, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtNotIn(List<BigDecimal> values) {
            addCriterion("PAY_AMT not in", values, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT between", value1, value2, "payAmt");
            return this;
        }

        public GeneratedCriteria andPayAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_AMT not between", value1, value2, "payAmt");
            return this;
        }
        public GeneratedCriteria andFactAmtIsNull() {
            addCriterion("FACT_AMT is null");
            return this;
        }

        public GeneratedCriteria andFactAmtIsNotNull() {
            addCriterion("FACT_AMT is not null");
            return this;
        }

        public GeneratedCriteria andFactAmtEqualTo(BigDecimal value) {
            addCriterion("FACT_AMT =", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtNotEqualTo(BigDecimal value) {
            addCriterion("FACT_AMT <>", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtGreaterThan(BigDecimal value) {
            addCriterion("FACT_AMT >", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_AMT >=", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtLessThan(BigDecimal value) {
            addCriterion("FACT_AMT <", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACT_AMT <=", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtLike(BigDecimal value) {
            addCriterion("FACT_AMT like", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtNotLike(BigDecimal value) {
            addCriterion("FACT_AMT not like", value, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtIn(List<BigDecimal> values) {
            addCriterion("FACT_AMT in", values, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtNotIn(List<BigDecimal> values) {
            addCriterion("FACT_AMT not in", values, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_AMT between", value1, value2, "factAmt");
            return this;
        }

        public GeneratedCriteria andFactAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACT_AMT not between", value1, value2, "factAmt");
            return this;
        }
        public GeneratedCriteria andUseTypeIsNull() {
            addCriterion("USE_TYPE is null");
            return this;
        }

        public GeneratedCriteria andUseTypeIsNotNull() {
            addCriterion("USE_TYPE is not null");
            return this;
        }

        public GeneratedCriteria andUseTypeEqualTo(String value) {
            addCriterion("USE_TYPE =", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeNotEqualTo(String value) {
            addCriterion("USE_TYPE <>", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeGreaterThan(String value) {
            addCriterion("USE_TYPE >", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TYPE >=", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeLessThan(String value) {
            addCriterion("USE_TYPE <", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("USE_TYPE <=", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeLike(String value) {
            addCriterion("USE_TYPE like", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeNotLike(String value) {
            addCriterion("USE_TYPE not like", value, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeIn(List<String> values) {
            addCriterion("USE_TYPE in", values, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeNotIn(List<String> values) {
            addCriterion("USE_TYPE not in", values, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeBetween(String value1, String value2) {
            addCriterion("USE_TYPE between", value1, value2, "useType");
            return this;
        }

        public GeneratedCriteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("USE_TYPE not between", value1, value2, "useType");
            return this;
        }
        public GeneratedCriteria andProxyWaterIdIsNull() {
            addCriterion("PROXY_WATER_ID is null");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdIsNotNull() {
            addCriterion("PROXY_WATER_ID is not null");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdEqualTo(String value) {
            addCriterion("PROXY_WATER_ID =", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdNotEqualTo(String value) {
            addCriterion("PROXY_WATER_ID <>", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdGreaterThan(String value) {
            addCriterion("PROXY_WATER_ID >", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROXY_WATER_ID >=", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdLessThan(String value) {
            addCriterion("PROXY_WATER_ID <", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdLessThanOrEqualTo(String value) {
            addCriterion("PROXY_WATER_ID <=", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdLike(String value) {
            addCriterion("PROXY_WATER_ID like", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdNotLike(String value) {
            addCriterion("PROXY_WATER_ID not like", value, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdIn(List<String> values) {
            addCriterion("PROXY_WATER_ID in", values, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdNotIn(List<String> values) {
            addCriterion("PROXY_WATER_ID not in", values, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdBetween(String value1, String value2) {
            addCriterion("PROXY_WATER_ID between", value1, value2, "proxyWaterId");
            return this;
        }

        public GeneratedCriteria andProxyWaterIdNotBetween(String value1, String value2) {
            addCriterion("PROXY_WATER_ID not between", value1, value2, "proxyWaterId");
            return this;
        }
        public GeneratedCriteria andCommidIsNull() {
            addCriterion("COMMID is null");
            return this;
        }

        public GeneratedCriteria andCommidIsNotNull() {
            addCriterion("COMMID is not null");
            return this;
        }

        public GeneratedCriteria andCommidEqualTo(String value) {
            addCriterion("COMMID =", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidNotEqualTo(String value) {
            addCriterion("COMMID <>", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidGreaterThan(String value) {
            addCriterion("COMMID >", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidGreaterThanOrEqualTo(String value) {
            addCriterion("COMMID >=", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidLessThan(String value) {
            addCriterion("COMMID <", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidLessThanOrEqualTo(String value) {
            addCriterion("COMMID <=", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidLike(String value) {
            addCriterion("COMMID like", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidNotLike(String value) {
            addCriterion("COMMID not like", value, "commid");
            return this;
        }

        public GeneratedCriteria andCommidIn(List<String> values) {
            addCriterion("COMMID in", values, "commid");
            return this;
        }

        public GeneratedCriteria andCommidNotIn(List<String> values) {
            addCriterion("COMMID not in", values, "commid");
            return this;
        }

        public GeneratedCriteria andCommidBetween(String value1, String value2) {
            addCriterion("COMMID between", value1, value2, "commid");
            return this;
        }

        public GeneratedCriteria andCommidNotBetween(String value1, String value2) {
            addCriterion("COMMID not between", value1, value2, "commid");
            return this;
        }
        public GeneratedCriteria andRespCodeIdIsNull() {
            addCriterion("RESP_CODE_ID is null");
            return this;
        }

        public GeneratedCriteria andRespCodeIdIsNotNull() {
            addCriterion("RESP_CODE_ID is not null");
            return this;
        }

        public GeneratedCriteria andRespCodeIdEqualTo(String value) {
            addCriterion("RESP_CODE_ID =", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdNotEqualTo(String value) {
            addCriterion("RESP_CODE_ID <>", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdGreaterThan(String value) {
            addCriterion("RESP_CODE_ID >", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_CODE_ID >=", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdLessThan(String value) {
            addCriterion("RESP_CODE_ID <", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdLessThanOrEqualTo(String value) {
            addCriterion("RESP_CODE_ID <=", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdLike(String value) {
            addCriterion("RESP_CODE_ID like", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdNotLike(String value) {
            addCriterion("RESP_CODE_ID not like", value, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdIn(List<String> values) {
            addCriterion("RESP_CODE_ID in", values, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdNotIn(List<String> values) {
            addCriterion("RESP_CODE_ID not in", values, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdBetween(String value1, String value2) {
            addCriterion("RESP_CODE_ID between", value1, value2, "respCodeId");
            return this;
        }

        public GeneratedCriteria andRespCodeIdNotBetween(String value1, String value2) {
            addCriterion("RESP_CODE_ID not between", value1, value2, "respCodeId");
            return this;
        }
        public GeneratedCriteria andRespResultIsNull() {
            addCriterion("RESP_RESULT is null");
            return this;
        }

        public GeneratedCriteria andRespResultIsNotNull() {
            addCriterion("RESP_RESULT is not null");
            return this;
        }

        public GeneratedCriteria andRespResultEqualTo(String value) {
            addCriterion("RESP_RESULT =", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultNotEqualTo(String value) {
            addCriterion("RESP_RESULT <>", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultGreaterThan(String value) {
            addCriterion("RESP_RESULT >", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESP_RESULT >=", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultLessThan(String value) {
            addCriterion("RESP_RESULT <", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultLessThanOrEqualTo(String value) {
            addCriterion("RESP_RESULT <=", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultLike(String value) {
            addCriterion("RESP_RESULT like", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultNotLike(String value) {
            addCriterion("RESP_RESULT not like", value, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultIn(List<String> values) {
            addCriterion("RESP_RESULT in", values, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultNotIn(List<String> values) {
            addCriterion("RESP_RESULT not in", values, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultBetween(String value1, String value2) {
            addCriterion("RESP_RESULT between", value1, value2, "respResult");
            return this;
        }

        public GeneratedCriteria andRespResultNotBetween(String value1, String value2) {
            addCriterion("RESP_RESULT not between", value1, value2, "respResult");
            return this;
        }
        public GeneratedCriteria andTelNumberIsNull() {
            addCriterion("TEL_NUMBER is null");
            return this;
        }

        public GeneratedCriteria andTelNumberIsNotNull() {
            addCriterion("TEL_NUMBER is not null");
            return this;
        }

        public GeneratedCriteria andTelNumberEqualTo(String value) {
            addCriterion("TEL_NUMBER =", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberNotEqualTo(String value) {
            addCriterion("TEL_NUMBER <>", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberGreaterThan(String value) {
            addCriterion("TEL_NUMBER >", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER >=", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberLessThan(String value) {
            addCriterion("TEL_NUMBER <", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberLessThanOrEqualTo(String value) {
            addCriterion("TEL_NUMBER <=", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberLike(String value) {
            addCriterion("TEL_NUMBER like", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberNotLike(String value) {
            addCriterion("TEL_NUMBER not like", value, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberIn(List<String> values) {
            addCriterion("TEL_NUMBER in", values, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberNotIn(List<String> values) {
            addCriterion("TEL_NUMBER not in", values, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER between", value1, value2, "telNumber");
            return this;
        }

        public GeneratedCriteria andTelNumberNotBetween(String value1, String value2) {
            addCriterion("TEL_NUMBER not between", value1, value2, "telNumber");
            return this;
        }
        public GeneratedCriteria andIsSendMessIdIsNull() {
            addCriterion("IS_SEND_MESS_ID is null");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdIsNotNull() {
            addCriterion("IS_SEND_MESS_ID is not null");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdEqualTo(String value) {
            addCriterion("IS_SEND_MESS_ID =", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdNotEqualTo(String value) {
            addCriterion("IS_SEND_MESS_ID <>", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdGreaterThan(String value) {
            addCriterion("IS_SEND_MESS_ID >", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SEND_MESS_ID >=", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdLessThan(String value) {
            addCriterion("IS_SEND_MESS_ID <", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdLessThanOrEqualTo(String value) {
            addCriterion("IS_SEND_MESS_ID <=", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdLike(String value) {
            addCriterion("IS_SEND_MESS_ID like", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdNotLike(String value) {
            addCriterion("IS_SEND_MESS_ID not like", value, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdIn(List<String> values) {
            addCriterion("IS_SEND_MESS_ID in", values, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdNotIn(List<String> values) {
            addCriterion("IS_SEND_MESS_ID not in", values, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdBetween(String value1, String value2) {
            addCriterion("IS_SEND_MESS_ID between", value1, value2, "isSendMessId");
            return this;
        }

        public GeneratedCriteria andIsSendMessIdNotBetween(String value1, String value2) {
            addCriterion("IS_SEND_MESS_ID not between", value1, value2, "isSendMessId");
            return this;
        }
        public GeneratedCriteria andHireStateIdIsNull() {
            addCriterion("HIRE_STATE_ID is null");
            return this;
        }

        public GeneratedCriteria andHireStateIdIsNotNull() {
            addCriterion("HIRE_STATE_ID is not null");
            return this;
        }

        public GeneratedCriteria andHireStateIdEqualTo(String value) {
            addCriterion("HIRE_STATE_ID =", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdNotEqualTo(String value) {
            addCriterion("HIRE_STATE_ID <>", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdGreaterThan(String value) {
            addCriterion("HIRE_STATE_ID >", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("HIRE_STATE_ID >=", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdLessThan(String value) {
            addCriterion("HIRE_STATE_ID <", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdLessThanOrEqualTo(String value) {
            addCriterion("HIRE_STATE_ID <=", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdLike(String value) {
            addCriterion("HIRE_STATE_ID like", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdNotLike(String value) {
            addCriterion("HIRE_STATE_ID not like", value, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdIn(List<String> values) {
            addCriterion("HIRE_STATE_ID in", values, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdNotIn(List<String> values) {
            addCriterion("HIRE_STATE_ID not in", values, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdBetween(String value1, String value2) {
            addCriterion("HIRE_STATE_ID between", value1, value2, "hireStateId");
            return this;
        }

        public GeneratedCriteria andHireStateIdNotBetween(String value1, String value2) {
            addCriterion("HIRE_STATE_ID not between", value1, value2, "hireStateId");
            return this;
        }
        public GeneratedCriteria andJycRelidIsNull() {
            addCriterion("JYC_RELID is null");
            return this;
        }

        public GeneratedCriteria andJycRelidIsNotNull() {
            addCriterion("JYC_RELID is not null");
            return this;
        }

        public GeneratedCriteria andJycRelidEqualTo(String value) {
            addCriterion("JYC_RELID =", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidNotEqualTo(String value) {
            addCriterion("JYC_RELID <>", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidGreaterThan(String value) {
            addCriterion("JYC_RELID >", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidGreaterThanOrEqualTo(String value) {
            addCriterion("JYC_RELID >=", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidLessThan(String value) {
            addCriterion("JYC_RELID <", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidLessThanOrEqualTo(String value) {
            addCriterion("JYC_RELID <=", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidLike(String value) {
            addCriterion("JYC_RELID like", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidNotLike(String value) {
            addCriterion("JYC_RELID not like", value, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidIn(List<String> values) {
            addCriterion("JYC_RELID in", values, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidNotIn(List<String> values) {
            addCriterion("JYC_RELID not in", values, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidBetween(String value1, String value2) {
            addCriterion("JYC_RELID between", value1, value2, "jycRelid");
            return this;
        }

        public GeneratedCriteria andJycRelidNotBetween(String value1, String value2) {
            addCriterion("JYC_RELID not between", value1, value2, "jycRelid");
            return this;
        }
        public GeneratedCriteria andPayChannelIdIsNull() {
            addCriterion("PAY_CHANNEL_ID is null");
            return this;
        }

        public GeneratedCriteria andPayChannelIdIsNotNull() {
            addCriterion("PAY_CHANNEL_ID is not null");
            return this;
        }

        public GeneratedCriteria andPayChannelIdEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ID =", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdNotEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ID <>", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdGreaterThan(String value) {
            addCriterion("PAY_CHANNEL_ID >", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ID >=", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdLessThan(String value) {
            addCriterion("PAY_CHANNEL_ID <", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHANNEL_ID <=", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdLike(String value) {
            addCriterion("PAY_CHANNEL_ID like", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdNotLike(String value) {
            addCriterion("PAY_CHANNEL_ID not like", value, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdIn(List<String> values) {
            addCriterion("PAY_CHANNEL_ID in", values, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdNotIn(List<String> values) {
            addCriterion("PAY_CHANNEL_ID not in", values, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_ID between", value1, value2, "payChannelId");
            return this;
        }

        public GeneratedCriteria andPayChannelIdNotBetween(String value1, String value2) {
            addCriterion("PAY_CHANNEL_ID not between", value1, value2, "payChannelId");
            return this;
        }
        public GeneratedCriteria andHalfDeductTimesIsNull() {
            addCriterion("HALF_DEDUCT_TIMES is null");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesIsNotNull() {
            addCriterion("HALF_DEDUCT_TIMES is not null");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesEqualTo(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES =", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesNotEqualTo(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES <>", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesGreaterThan(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES >", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES >=", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesLessThan(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES <", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesLessThanOrEqualTo(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES <=", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesLike(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES like", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesNotLike(Integer value) {
            addCriterion("HALF_DEDUCT_TIMES not like", value, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesIn(List<Integer> values) {
            addCriterion("HALF_DEDUCT_TIMES in", values, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesNotIn(List<Integer> values) {
            addCriterion("HALF_DEDUCT_TIMES not in", values, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesBetween(Integer value1, Integer value2) {
            addCriterion("HALF_DEDUCT_TIMES between", value1, value2, "halfDeductTimes");
            return this;
        }

        public GeneratedCriteria andHalfDeductTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("HALF_DEDUCT_TIMES not between", value1, value2, "halfDeductTimes");
            return this;
        }
        public GeneratedCriteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return this;
        }

        public GeneratedCriteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return this;
        }

        public GeneratedCriteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return this;
        }

        public GeneratedCriteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return this;
        }
        public GeneratedCriteria andStateIdIsNull() {
            addCriterion("STATE_ID is null");
            return this;
        }

        public GeneratedCriteria andStateIdIsNotNull() {
            addCriterion("STATE_ID is not null");
            return this;
        }

        public GeneratedCriteria andStateIdEqualTo(String value) {
            addCriterion("STATE_ID =", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdNotEqualTo(String value) {
            addCriterion("STATE_ID <>", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdGreaterThan(String value) {
            addCriterion("STATE_ID >", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_ID >=", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdLessThan(String value) {
            addCriterion("STATE_ID <", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdLessThanOrEqualTo(String value) {
            addCriterion("STATE_ID <=", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdLike(String value) {
            addCriterion("STATE_ID like", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdNotLike(String value) {
            addCriterion("STATE_ID not like", value, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdIn(List<String> values) {
            addCriterion("STATE_ID in", values, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdNotIn(List<String> values) {
            addCriterion("STATE_ID not in", values, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdBetween(String value1, String value2) {
            addCriterion("STATE_ID between", value1, value2, "stateId");
            return this;
        }

        public GeneratedCriteria andStateIdNotBetween(String value1, String value2) {
            addCriterion("STATE_ID not between", value1, value2, "stateId");
            return this;
        }
    }
}