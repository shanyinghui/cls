package com.sinfusi.freedom.rm.example;

import com.sinfusi.freedom.core.example.AbstractCriteria;
import com.sinfusi.freedom.core.example.AbstractExample;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * rm_ebankdeductfile标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
public class RmEbankdeductfileExample extends AbstractExample<RmEbankdeductfileExample.GeneratedCriteria> {

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
            public GeneratedCriteria andCustClassIdIsNull() {
                addCriterion("CUST_CLASS_ID is null");
                return this;
            }

            public GeneratedCriteria andCustClassIdIsNotNull() {
                addCriterion("CUST_CLASS_ID is not null");
                return this;
            }

            public GeneratedCriteria andCustClassIdEqualTo(String value) {
                addCriterion("CUST_CLASS_ID =", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdNotEqualTo(String value) {
                addCriterion("CUST_CLASS_ID <>", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdGreaterThan(String value) {
                addCriterion("CUST_CLASS_ID >", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdGreaterThanOrEqualTo(String value) {
                addCriterion("CUST_CLASS_ID >=", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdLessThan(String value) {
                addCriterion("CUST_CLASS_ID <", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdLessThanOrEqualTo(String value) {
                addCriterion("CUST_CLASS_ID <=", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdLike(String value) {
                addCriterion("CUST_CLASS_ID like", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdNotLike(String value) {
                addCriterion("CUST_CLASS_ID not like", value, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdIn(List<String> values) {
                addCriterion("CUST_CLASS_ID in", values, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdNotIn(List<String> values) {
                addCriterion("CUST_CLASS_ID not in", values, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdBetween(String value1, String value2) {
                addCriterion("CUST_CLASS_ID between", value1, value2, "custClassId");
                return this;
            }

            public GeneratedCriteria andCustClassIdNotBetween(String value1, String value2) {
                addCriterion("CUST_CLASS_ID not between", value1, value2, "custClassId");
                return this;
            }
            public GeneratedCriteria andEbankNameIsNull() {
                addCriterion("EBANK_NAME is null");
                return this;
            }

            public GeneratedCriteria andEbankNameIsNotNull() {
                addCriterion("EBANK_NAME is not null");
                return this;
            }

            public GeneratedCriteria andEbankNameEqualTo(String value) {
                addCriterion("EBANK_NAME =", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameNotEqualTo(String value) {
                addCriterion("EBANK_NAME <>", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameGreaterThan(String value) {
                addCriterion("EBANK_NAME >", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameGreaterThanOrEqualTo(String value) {
                addCriterion("EBANK_NAME >=", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameLessThan(String value) {
                addCriterion("EBANK_NAME <", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameLessThanOrEqualTo(String value) {
                addCriterion("EBANK_NAME <=", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameLike(String value) {
                addCriterion("EBANK_NAME like", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameNotLike(String value) {
                addCriterion("EBANK_NAME not like", value, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameIn(List<String> values) {
                addCriterion("EBANK_NAME in", values, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameNotIn(List<String> values) {
                addCriterion("EBANK_NAME not in", values, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameBetween(String value1, String value2) {
                addCriterion("EBANK_NAME between", value1, value2, "ebankName");
                return this;
            }

            public GeneratedCriteria andEbankNameNotBetween(String value1, String value2) {
                addCriterion("EBANK_NAME not between", value1, value2, "ebankName");
                return this;
            }
            public GeneratedCriteria andMakeAmtIsNull() {
                addCriterion("MAKE_AMT is null");
                return this;
            }

            public GeneratedCriteria andMakeAmtIsNotNull() {
                addCriterion("MAKE_AMT is not null");
                return this;
            }

            public GeneratedCriteria andMakeAmtEqualTo(BigDecimal value) {
                addCriterion("MAKE_AMT =", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtNotEqualTo(BigDecimal value) {
                addCriterion("MAKE_AMT <>", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtGreaterThan(BigDecimal value) {
                addCriterion("MAKE_AMT >", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("MAKE_AMT >=", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtLessThan(BigDecimal value) {
                addCriterion("MAKE_AMT <", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtLessThanOrEqualTo(BigDecimal value) {
                addCriterion("MAKE_AMT <=", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtLike(BigDecimal value) {
                addCriterion("MAKE_AMT like", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtNotLike(BigDecimal value) {
                addCriterion("MAKE_AMT not like", value, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtIn(List<BigDecimal> values) {
                addCriterion("MAKE_AMT in", values, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtNotIn(List<BigDecimal> values) {
                addCriterion("MAKE_AMT not in", values, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("MAKE_AMT between", value1, value2, "makeAmt");
                return this;
            }

            public GeneratedCriteria andMakeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("MAKE_AMT not between", value1, value2, "makeAmt");
                return this;
            }
            public GeneratedCriteria andMakeCountIsNull() {
                addCriterion("MAKE_COUNT is null");
                return this;
            }

            public GeneratedCriteria andMakeCountIsNotNull() {
                addCriterion("MAKE_COUNT is not null");
                return this;
            }

            public GeneratedCriteria andMakeCountEqualTo(Integer value) {
                addCriterion("MAKE_COUNT =", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountNotEqualTo(Integer value) {
                addCriterion("MAKE_COUNT <>", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountGreaterThan(Integer value) {
                addCriterion("MAKE_COUNT >", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountGreaterThanOrEqualTo(Integer value) {
                addCriterion("MAKE_COUNT >=", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountLessThan(Integer value) {
                addCriterion("MAKE_COUNT <", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountLessThanOrEqualTo(Integer value) {
                addCriterion("MAKE_COUNT <=", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountLike(Integer value) {
                addCriterion("MAKE_COUNT like", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountNotLike(Integer value) {
                addCriterion("MAKE_COUNT not like", value, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountIn(List<Integer> values) {
                addCriterion("MAKE_COUNT in", values, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountNotIn(List<Integer> values) {
                addCriterion("MAKE_COUNT not in", values, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountBetween(Integer value1, Integer value2) {
                addCriterion("MAKE_COUNT between", value1, value2, "makeCount");
                return this;
            }

            public GeneratedCriteria andMakeCountNotBetween(Integer value1, Integer value2) {
                addCriterion("MAKE_COUNT not between", value1, value2, "makeCount");
                return this;
            }
            public GeneratedCriteria andMakeFilePathIsNull() {
                addCriterion("MAKE_FILE_PATH is null");
                return this;
            }

            public GeneratedCriteria andMakeFilePathIsNotNull() {
                addCriterion("MAKE_FILE_PATH is not null");
                return this;
            }

            public GeneratedCriteria andMakeFilePathEqualTo(String value) {
                addCriterion("MAKE_FILE_PATH =", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathNotEqualTo(String value) {
                addCriterion("MAKE_FILE_PATH <>", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathGreaterThan(String value) {
                addCriterion("MAKE_FILE_PATH >", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathGreaterThanOrEqualTo(String value) {
                addCriterion("MAKE_FILE_PATH >=", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathLessThan(String value) {
                addCriterion("MAKE_FILE_PATH <", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathLessThanOrEqualTo(String value) {
                addCriterion("MAKE_FILE_PATH <=", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathLike(String value) {
                addCriterion("MAKE_FILE_PATH like", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathNotLike(String value) {
                addCriterion("MAKE_FILE_PATH not like", value, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathIn(List<String> values) {
                addCriterion("MAKE_FILE_PATH in", values, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathNotIn(List<String> values) {
                addCriterion("MAKE_FILE_PATH not in", values, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathBetween(String value1, String value2) {
                addCriterion("MAKE_FILE_PATH between", value1, value2, "makeFilePath");
                return this;
            }

            public GeneratedCriteria andMakeFilePathNotBetween(String value1, String value2) {
                addCriterion("MAKE_FILE_PATH not between", value1, value2, "makeFilePath");
                return this;
            }
            public GeneratedCriteria andMakeFileNameIsNull() {
                addCriterion("MAKE_FILE_NAME is null");
                return this;
            }

            public GeneratedCriteria andMakeFileNameIsNotNull() {
                addCriterion("MAKE_FILE_NAME is not null");
                return this;
            }

            public GeneratedCriteria andMakeFileNameEqualTo(String value) {
                addCriterion("MAKE_FILE_NAME =", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameNotEqualTo(String value) {
                addCriterion("MAKE_FILE_NAME <>", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameGreaterThan(String value) {
                addCriterion("MAKE_FILE_NAME >", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameGreaterThanOrEqualTo(String value) {
                addCriterion("MAKE_FILE_NAME >=", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameLessThan(String value) {
                addCriterion("MAKE_FILE_NAME <", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameLessThanOrEqualTo(String value) {
                addCriterion("MAKE_FILE_NAME <=", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameLike(String value) {
                addCriterion("MAKE_FILE_NAME like", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameNotLike(String value) {
                addCriterion("MAKE_FILE_NAME not like", value, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameIn(List<String> values) {
                addCriterion("MAKE_FILE_NAME in", values, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameNotIn(List<String> values) {
                addCriterion("MAKE_FILE_NAME not in", values, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameBetween(String value1, String value2) {
                addCriterion("MAKE_FILE_NAME between", value1, value2, "makeFileName");
                return this;
            }

            public GeneratedCriteria andMakeFileNameNotBetween(String value1, String value2) {
                addCriterion("MAKE_FILE_NAME not between", value1, value2, "makeFileName");
                return this;
            }
            public GeneratedCriteria andMakeTimeIsNull() {
                addCriterion("MAKE_TIME is null");
                return this;
            }

            public GeneratedCriteria andMakeTimeIsNotNull() {
                addCriterion("MAKE_TIME is not null");
                return this;
            }

            public GeneratedCriteria andMakeTimeEqualTo(LocalDateTime value) {
                addCriterion("MAKE_TIME =", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeNotEqualTo(LocalDateTime value) {
                addCriterion("MAKE_TIME <>", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeGreaterThan(LocalDateTime value) {
                addCriterion("MAKE_TIME >", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("MAKE_TIME >=", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeLessThan(LocalDateTime value) {
                addCriterion("MAKE_TIME <", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("MAKE_TIME <=", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeLike(LocalDateTime value) {
                addCriterion("MAKE_TIME like", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeNotLike(LocalDateTime value) {
                addCriterion("MAKE_TIME not like", value, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeIn(List<LocalDateTime> values) {
                addCriterion("MAKE_TIME in", values, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeNotIn(List<LocalDateTime> values) {
                addCriterion("MAKE_TIME not in", values, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("MAKE_TIME between", value1, value2, "makeTime");
                return this;
            }

            public GeneratedCriteria andMakeTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("MAKE_TIME not between", value1, value2, "makeTime");
                return this;
            }
            public GeneratedCriteria andMakerIsNull() {
                addCriterion("MAKER is null");
                return this;
            }

            public GeneratedCriteria andMakerIsNotNull() {
                addCriterion("MAKER is not null");
                return this;
            }

            public GeneratedCriteria andMakerEqualTo(String value) {
                addCriterion("MAKER =", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerNotEqualTo(String value) {
                addCriterion("MAKER <>", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerGreaterThan(String value) {
                addCriterion("MAKER >", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerGreaterThanOrEqualTo(String value) {
                addCriterion("MAKER >=", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerLessThan(String value) {
                addCriterion("MAKER <", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerLessThanOrEqualTo(String value) {
                addCriterion("MAKER <=", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerLike(String value) {
                addCriterion("MAKER like", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerNotLike(String value) {
                addCriterion("MAKER not like", value, "maker");
                return this;
            }

            public GeneratedCriteria andMakerIn(List<String> values) {
                addCriterion("MAKER in", values, "maker");
                return this;
            }

            public GeneratedCriteria andMakerNotIn(List<String> values) {
                addCriterion("MAKER not in", values, "maker");
                return this;
            }

            public GeneratedCriteria andMakerBetween(String value1, String value2) {
                addCriterion("MAKER between", value1, value2, "maker");
                return this;
            }

            public GeneratedCriteria andMakerNotBetween(String value1, String value2) {
                addCriterion("MAKER not between", value1, value2, "maker");
                return this;
            }
            public GeneratedCriteria andBackTimeIsNull() {
                addCriterion("BACK_TIME is null");
                return this;
            }

            public GeneratedCriteria andBackTimeIsNotNull() {
                addCriterion("BACK_TIME is not null");
                return this;
            }

            public GeneratedCriteria andBackTimeEqualTo(LocalDateTime value) {
                addCriterion("BACK_TIME =", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeNotEqualTo(LocalDateTime value) {
                addCriterion("BACK_TIME <>", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeGreaterThan(LocalDateTime value) {
                addCriterion("BACK_TIME >", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("BACK_TIME >=", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeLessThan(LocalDateTime value) {
                addCriterion("BACK_TIME <", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("BACK_TIME <=", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeLike(LocalDateTime value) {
                addCriterion("BACK_TIME like", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeNotLike(LocalDateTime value) {
                addCriterion("BACK_TIME not like", value, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeIn(List<LocalDateTime> values) {
                addCriterion("BACK_TIME in", values, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeNotIn(List<LocalDateTime> values) {
                addCriterion("BACK_TIME not in", values, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("BACK_TIME between", value1, value2, "backTime");
                return this;
            }

            public GeneratedCriteria andBackTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("BACK_TIME not between", value1, value2, "backTime");
                return this;
            }
            public GeneratedCriteria andUploaderIsNull() {
                addCriterion("UPLOADER is null");
                return this;
            }

            public GeneratedCriteria andUploaderIsNotNull() {
                addCriterion("UPLOADER is not null");
                return this;
            }

            public GeneratedCriteria andUploaderEqualTo(String value) {
                addCriterion("UPLOADER =", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderNotEqualTo(String value) {
                addCriterion("UPLOADER <>", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderGreaterThan(String value) {
                addCriterion("UPLOADER >", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderGreaterThanOrEqualTo(String value) {
                addCriterion("UPLOADER >=", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderLessThan(String value) {
                addCriterion("UPLOADER <", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderLessThanOrEqualTo(String value) {
                addCriterion("UPLOADER <=", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderLike(String value) {
                addCriterion("UPLOADER like", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderNotLike(String value) {
                addCriterion("UPLOADER not like", value, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderIn(List<String> values) {
                addCriterion("UPLOADER in", values, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderNotIn(List<String> values) {
                addCriterion("UPLOADER not in", values, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderBetween(String value1, String value2) {
                addCriterion("UPLOADER between", value1, value2, "uploader");
                return this;
            }

            public GeneratedCriteria andUploaderNotBetween(String value1, String value2) {
                addCriterion("UPLOADER not between", value1, value2, "uploader");
                return this;
            }
            public GeneratedCriteria andBackFilePathIsNull() {
                addCriterion("BACK_FILE_PATH is null");
                return this;
            }

            public GeneratedCriteria andBackFilePathIsNotNull() {
                addCriterion("BACK_FILE_PATH is not null");
                return this;
            }

            public GeneratedCriteria andBackFilePathEqualTo(String value) {
                addCriterion("BACK_FILE_PATH =", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathNotEqualTo(String value) {
                addCriterion("BACK_FILE_PATH <>", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathGreaterThan(String value) {
                addCriterion("BACK_FILE_PATH >", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathGreaterThanOrEqualTo(String value) {
                addCriterion("BACK_FILE_PATH >=", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathLessThan(String value) {
                addCriterion("BACK_FILE_PATH <", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathLessThanOrEqualTo(String value) {
                addCriterion("BACK_FILE_PATH <=", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathLike(String value) {
                addCriterion("BACK_FILE_PATH like", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathNotLike(String value) {
                addCriterion("BACK_FILE_PATH not like", value, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathIn(List<String> values) {
                addCriterion("BACK_FILE_PATH in", values, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathNotIn(List<String> values) {
                addCriterion("BACK_FILE_PATH not in", values, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathBetween(String value1, String value2) {
                addCriterion("BACK_FILE_PATH between", value1, value2, "backFilePath");
                return this;
            }

            public GeneratedCriteria andBackFilePathNotBetween(String value1, String value2) {
                addCriterion("BACK_FILE_PATH not between", value1, value2, "backFilePath");
                return this;
            }
            public GeneratedCriteria andBackFileNameIsNull() {
                addCriterion("BACK_FILE_NAME is null");
                return this;
            }

            public GeneratedCriteria andBackFileNameIsNotNull() {
                addCriterion("BACK_FILE_NAME is not null");
                return this;
            }

            public GeneratedCriteria andBackFileNameEqualTo(String value) {
                addCriterion("BACK_FILE_NAME =", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameNotEqualTo(String value) {
                addCriterion("BACK_FILE_NAME <>", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameGreaterThan(String value) {
                addCriterion("BACK_FILE_NAME >", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameGreaterThanOrEqualTo(String value) {
                addCriterion("BACK_FILE_NAME >=", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameLessThan(String value) {
                addCriterion("BACK_FILE_NAME <", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameLessThanOrEqualTo(String value) {
                addCriterion("BACK_FILE_NAME <=", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameLike(String value) {
                addCriterion("BACK_FILE_NAME like", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameNotLike(String value) {
                addCriterion("BACK_FILE_NAME not like", value, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameIn(List<String> values) {
                addCriterion("BACK_FILE_NAME in", values, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameNotIn(List<String> values) {
                addCriterion("BACK_FILE_NAME not in", values, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameBetween(String value1, String value2) {
                addCriterion("BACK_FILE_NAME between", value1, value2, "backFileName");
                return this;
            }

            public GeneratedCriteria andBackFileNameNotBetween(String value1, String value2) {
                addCriterion("BACK_FILE_NAME not between", value1, value2, "backFileName");
                return this;
            }
            public GeneratedCriteria andBackAmtIsNull() {
                addCriterion("BACK_AMT is null");
                return this;
            }

            public GeneratedCriteria andBackAmtIsNotNull() {
                addCriterion("BACK_AMT is not null");
                return this;
            }

            public GeneratedCriteria andBackAmtEqualTo(BigDecimal value) {
                addCriterion("BACK_AMT =", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtNotEqualTo(BigDecimal value) {
                addCriterion("BACK_AMT <>", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtGreaterThan(BigDecimal value) {
                addCriterion("BACK_AMT >", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("BACK_AMT >=", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtLessThan(BigDecimal value) {
                addCriterion("BACK_AMT <", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtLessThanOrEqualTo(BigDecimal value) {
                addCriterion("BACK_AMT <=", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtLike(BigDecimal value) {
                addCriterion("BACK_AMT like", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtNotLike(BigDecimal value) {
                addCriterion("BACK_AMT not like", value, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtIn(List<BigDecimal> values) {
                addCriterion("BACK_AMT in", values, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtNotIn(List<BigDecimal> values) {
                addCriterion("BACK_AMT not in", values, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("BACK_AMT between", value1, value2, "backAmt");
                return this;
            }

            public GeneratedCriteria andBackAmtNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("BACK_AMT not between", value1, value2, "backAmt");
                return this;
            }
            public GeneratedCriteria andBackCountIsNull() {
                addCriterion("BACK_COUNT is null");
                return this;
            }

            public GeneratedCriteria andBackCountIsNotNull() {
                addCriterion("BACK_COUNT is not null");
                return this;
            }

            public GeneratedCriteria andBackCountEqualTo(Integer value) {
                addCriterion("BACK_COUNT =", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountNotEqualTo(Integer value) {
                addCriterion("BACK_COUNT <>", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountGreaterThan(Integer value) {
                addCriterion("BACK_COUNT >", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountGreaterThanOrEqualTo(Integer value) {
                addCriterion("BACK_COUNT >=", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountLessThan(Integer value) {
                addCriterion("BACK_COUNT <", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountLessThanOrEqualTo(Integer value) {
                addCriterion("BACK_COUNT <=", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountLike(Integer value) {
                addCriterion("BACK_COUNT like", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountNotLike(Integer value) {
                addCriterion("BACK_COUNT not like", value, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountIn(List<Integer> values) {
                addCriterion("BACK_COUNT in", values, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountNotIn(List<Integer> values) {
                addCriterion("BACK_COUNT not in", values, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountBetween(Integer value1, Integer value2) {
                addCriterion("BACK_COUNT between", value1, value2, "backCount");
                return this;
            }

            public GeneratedCriteria andBackCountNotBetween(Integer value1, Integer value2) {
                addCriterion("BACK_COUNT not between", value1, value2, "backCount");
                return this;
            }
            public GeneratedCriteria andScountIsNull() {
                addCriterion("SCOUNT is null");
                return this;
            }

            public GeneratedCriteria andScountIsNotNull() {
                addCriterion("SCOUNT is not null");
                return this;
            }

            public GeneratedCriteria andScountEqualTo(Integer value) {
                addCriterion("SCOUNT =", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountNotEqualTo(Integer value) {
                addCriterion("SCOUNT <>", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountGreaterThan(Integer value) {
                addCriterion("SCOUNT >", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountGreaterThanOrEqualTo(Integer value) {
                addCriterion("SCOUNT >=", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountLessThan(Integer value) {
                addCriterion("SCOUNT <", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountLessThanOrEqualTo(Integer value) {
                addCriterion("SCOUNT <=", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountLike(Integer value) {
                addCriterion("SCOUNT like", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountNotLike(Integer value) {
                addCriterion("SCOUNT not like", value, "scount");
                return this;
            }

            public GeneratedCriteria andScountIn(List<Integer> values) {
                addCriterion("SCOUNT in", values, "scount");
                return this;
            }

            public GeneratedCriteria andScountNotIn(List<Integer> values) {
                addCriterion("SCOUNT not in", values, "scount");
                return this;
            }

            public GeneratedCriteria andScountBetween(Integer value1, Integer value2) {
                addCriterion("SCOUNT between", value1, value2, "scount");
                return this;
            }

            public GeneratedCriteria andScountNotBetween(Integer value1, Integer value2) {
                addCriterion("SCOUNT not between", value1, value2, "scount");
                return this;
            }
            public GeneratedCriteria andSamtIsNull() {
                addCriterion("SAMT is null");
                return this;
            }

            public GeneratedCriteria andSamtIsNotNull() {
                addCriterion("SAMT is not null");
                return this;
            }

            public GeneratedCriteria andSamtEqualTo(BigDecimal value) {
                addCriterion("SAMT =", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtNotEqualTo(BigDecimal value) {
                addCriterion("SAMT <>", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtGreaterThan(BigDecimal value) {
                addCriterion("SAMT >", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("SAMT >=", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtLessThan(BigDecimal value) {
                addCriterion("SAMT <", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtLessThanOrEqualTo(BigDecimal value) {
                addCriterion("SAMT <=", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtLike(BigDecimal value) {
                addCriterion("SAMT like", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtNotLike(BigDecimal value) {
                addCriterion("SAMT not like", value, "samt");
                return this;
            }

            public GeneratedCriteria andSamtIn(List<BigDecimal> values) {
                addCriterion("SAMT in", values, "samt");
                return this;
            }

            public GeneratedCriteria andSamtNotIn(List<BigDecimal> values) {
                addCriterion("SAMT not in", values, "samt");
                return this;
            }

            public GeneratedCriteria andSamtBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("SAMT between", value1, value2, "samt");
                return this;
            }

            public GeneratedCriteria andSamtNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("SAMT not between", value1, value2, "samt");
                return this;
            }
            public GeneratedCriteria andDataStateIdIsNull() {
                addCriterion("DATA_STATE_ID is null");
                return this;
            }

            public GeneratedCriteria andDataStateIdIsNotNull() {
                addCriterion("DATA_STATE_ID is not null");
                return this;
            }

            public GeneratedCriteria andDataStateIdEqualTo(String value) {
                addCriterion("DATA_STATE_ID =", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdNotEqualTo(String value) {
                addCriterion("DATA_STATE_ID <>", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdGreaterThan(String value) {
                addCriterion("DATA_STATE_ID >", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdGreaterThanOrEqualTo(String value) {
                addCriterion("DATA_STATE_ID >=", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdLessThan(String value) {
                addCriterion("DATA_STATE_ID <", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdLessThanOrEqualTo(String value) {
                addCriterion("DATA_STATE_ID <=", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdLike(String value) {
                addCriterion("DATA_STATE_ID like", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdNotLike(String value) {
                addCriterion("DATA_STATE_ID not like", value, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdIn(List<String> values) {
                addCriterion("DATA_STATE_ID in", values, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdNotIn(List<String> values) {
                addCriterion("DATA_STATE_ID not in", values, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdBetween(String value1, String value2) {
                addCriterion("DATA_STATE_ID between", value1, value2, "dataStateId");
                return this;
            }

            public GeneratedCriteria andDataStateIdNotBetween(String value1, String value2) {
                addCriterion("DATA_STATE_ID not between", value1, value2, "dataStateId");
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
            public GeneratedCriteria andCostTypeIdIsNull() {
                addCriterion("COST_TYPE_ID is null");
                return this;
            }

            public GeneratedCriteria andCostTypeIdIsNotNull() {
                addCriterion("COST_TYPE_ID is not null");
                return this;
            }

            public GeneratedCriteria andCostTypeIdEqualTo(String value) {
                addCriterion("COST_TYPE_ID =", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdNotEqualTo(String value) {
                addCriterion("COST_TYPE_ID <>", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdGreaterThan(String value) {
                addCriterion("COST_TYPE_ID >", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdGreaterThanOrEqualTo(String value) {
                addCriterion("COST_TYPE_ID >=", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdLessThan(String value) {
                addCriterion("COST_TYPE_ID <", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdLessThanOrEqualTo(String value) {
                addCriterion("COST_TYPE_ID <=", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdLike(String value) {
                addCriterion("COST_TYPE_ID like", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdNotLike(String value) {
                addCriterion("COST_TYPE_ID not like", value, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdIn(List<String> values) {
                addCriterion("COST_TYPE_ID in", values, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdNotIn(List<String> values) {
                addCriterion("COST_TYPE_ID not in", values, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdBetween(String value1, String value2) {
                addCriterion("COST_TYPE_ID between", value1, value2, "costTypeId");
                return this;
            }

            public GeneratedCriteria andCostTypeIdNotBetween(String value1, String value2) {
                addCriterion("COST_TYPE_ID not between", value1, value2, "costTypeId");
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
        }
    }