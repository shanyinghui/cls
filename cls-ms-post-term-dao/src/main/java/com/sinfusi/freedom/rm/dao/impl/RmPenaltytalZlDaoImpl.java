package com.sinfusi.freedom.rm.dao.impl;

import com.sinfusi.freedom.core.base.dao.impl.AbstractBaseDaoImpl;
import com.sinfusi.freedom.core.utils.Assert;
import com.sinfusi.freedom.core.utils.CommUtils;
import com.sinfusi.freedom.rm.criteria.RmPenaltytalZlCriteria;
import com.sinfusi.freedom.rm.dao.IRmPenaltytalZlDao;
import com.sinfusi.freedom.rm.entity.RmPenaltytalZl;
import com.sinfusi.freedom.rm.example.RmPenaltytalZlExample;
import com.sinfusi.freedom.rm.mapper.IRmPenaltytalZlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * rm_penaltytal_zl Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
@Repository
public class RmPenaltytalZlDaoImpl extends AbstractBaseDaoImpl<RmPenaltytalZlExample,RmPenaltytalZlCriteria, RmPenaltytalZl, IRmPenaltytalZlMapper> implements IRmPenaltytalZlDao {

    @Autowired
    private IRmPenaltytalZlMapper rmPenaltytalZlMapper;

    /**
     * 创建/更新.
     *
     * @param rmRentplantabZl
     * @return
     */
    @Override
    public void createOrUpdate(RmPenaltytalZl rmRentplantabZl) {
        if (CommUtils.isEmptyStr(rmRentplantabZl.getId())) {
            int result = this.rmPenaltytalZlMapper.insert(rmRentplantabZl);
            Assert.notEquals(result, 0, "新建失败!");
        } else {
            int result = this.rmPenaltytalZlMapper.update(rmRentplantabZl);
            Assert.notEquals(result, 0, "更新失败!");
        }
    }
}