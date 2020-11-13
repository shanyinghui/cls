package com.sinfusi.freedom.rm.dao.impl;

import com.sinfusi.freedom.core.base.dao.impl.AbstractBaseDaoImpl;
import com.sinfusi.freedom.rm.criteria.RmEbankdeductDetCriteria;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductDetDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductDet;
import com.sinfusi.freedom.rm.example.RmEbankdeductDetExample;
import com.sinfusi.freedom.rm.mapper.IRmEbankdeductDetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * rm_ebankdeduct_det Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
@Repository
public class RmEbankdeductDetDaoImpl extends AbstractBaseDaoImpl<RmEbankdeductDetExample,RmEbankdeductDetCriteria, RmEbankdeductDet, IRmEbankdeductDetMapper> implements IRmEbankdeductDetDao {

    @Autowired
    private IRmEbankdeductDetMapper rmEbankdeductDetMapper;


    @Override
    public List<HashMap> findAllRmEbankdeductDets(String custClassId, String bankType, String planDate, String recBank, String recAcct, String payBank) {
        return rmEbankdeductDetMapper.findAllRmEbankdeductDets(custClassId,bankType,planDate,recBank,recAcct,payBank);
    }

    @Override
    public List<HashMap> findAllRmEbankdeductDetsFX(String custClassId, String bankType, String planDate, String recBank, String recAcct, String payBank) {
        return rmEbankdeductDetMapper.findAllRmEbankdeductDetsFX(custClassId,bankType,planDate,recBank,recAcct,payBank);
    }

    @Override
    public List<HashMap> findAllRmEbankdeductDetsMYJK(String custClassId, String bankType, String planDate, String recBank, String recAcct,String payBank) {
        return rmEbankdeductDetMapper.findAllRmEbankdeductDetsMYJK(custClassId,bankType,planDate,recBank,recAcct,payBank);
    }

    @Override
    public List<HashMap> findAllRmEbankdeductDetsJQK(String custClassId, String bankType, String planDate, String recBank, String recAcct, String payBank) {
        return rmEbankdeductDetMapper.findAllRmEbankdeductDetsJQK(custClassId,bankType,planDate,recBank,recAcct,payBank);
    }



}