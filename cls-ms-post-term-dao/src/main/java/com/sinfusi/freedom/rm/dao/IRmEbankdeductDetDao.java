package com.sinfusi.freedom.rm.dao;

import com.sinfusi.freedom.core.base.dao.IBaseDao;
import com.sinfusi.freedom.rm.criteria.RmEbankdeductDetCriteria;
import com.sinfusi.freedom.rm.entity.RmEbankdeductDet;
import com.sinfusi.freedom.rm.example.RmEbankdeductDetExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * rm_ebankdeduct_det Dao接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
public interface IRmEbankdeductDetDao extends IBaseDao<RmEbankdeductDetExample,RmEbankdeductDetCriteria, RmEbankdeductDet> {

    // 租金
    List<HashMap> findAllRmEbankdeductDets(@Param("custClassId") String custClassId , @Param("bankType") String bankType, @Param("planDate") String planDate, @Param("recBank") String recBank, @Param("recAcct") String recAcct, @Param("payBank") String payBank);
    // 罚息
    List<HashMap> findAllRmEbankdeductDetsFX(@Param("custClassId") String custClassId , @Param("bankType") String bankType,@Param("planDate") String planDate,@Param("recBank") String recBank,@Param("recAcct") String recAcct,@Param("payBank") String payBank);
    // 名义价款
    List<HashMap> findAllRmEbankdeductDetsMYJK(@Param("custClassId") String custClassId , @Param("bankType") String bankType,@Param("planDate") String planDate,@Param("recBank") String recBank,@Param("recAcct") String recAcct,@Param("payBank") String payBank);
    // 结清款
    List<HashMap> findAllRmEbankdeductDetsJQK(@Param("custClassId") String custClassId , @Param("bankType") String bankType,@Param("planDate") String planDate,@Param("recBank") String recBank,@Param("recAcct") String recAcct,@Param("payBank") String payBank);
}