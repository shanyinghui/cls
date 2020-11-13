package com.sinfusi.freedom.rm.dao.impl;

import com.sinfusi.freedom.core.base.dao.impl.AbstractBaseDaoImpl;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductfileDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductfile;
import com.sinfusi.freedom.rm.example.RmEbankdeductfileExample;
import com.sinfusi.freedom.rm.criteria.RmEbankdeductfileCriteria;
import com.sinfusi.freedom.rm.mapper.IRmEbankdeductfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * rm_ebankdeductfile Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
@Repository
public class RmEbankdeductfileDaoImpl extends AbstractBaseDaoImpl<RmEbankdeductfileExample,RmEbankdeductfileCriteria, RmEbankdeductfile, IRmEbankdeductfileMapper> implements IRmEbankdeductfileDao {

    @Autowired
    private IRmEbankdeductfileMapper rmEbankdeductfileMapper;
}