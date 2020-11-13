package com.sinfusi.freedom.rm.dao.impl;

import com.sinfusi.freedom.core.base.dao.impl.AbstractBaseDaoImpl;
import com.sinfusi.freedom.rm.dao.IRmRentplantabZlDao;
import com.sinfusi.freedom.rm.entity.RmRentplantabZl;
import com.sinfusi.freedom.rm.example.RmRentplantabZlExample;
import com.sinfusi.freedom.rm.criteria.RmRentplantabZlCriteria;
import com.sinfusi.freedom.rm.mapper.IRmRentplantabZlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * rm_rentplantab_zl Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
@Repository
public class RmRentplantabZlDaoImpl extends AbstractBaseDaoImpl<RmRentplantabZlExample,RmRentplantabZlCriteria, RmRentplantabZl, IRmRentplantabZlMapper> implements IRmRentplantabZlDao {

    @Autowired
    private IRmRentplantabZlMapper rmRentplantabZlMapper;
}