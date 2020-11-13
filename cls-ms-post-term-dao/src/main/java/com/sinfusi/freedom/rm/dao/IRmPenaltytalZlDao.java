package com.sinfusi.freedom.rm.dao;

import com.sinfusi.freedom.core.base.dao.IBaseDao;
import com.sinfusi.freedom.rm.entity.RmPenaltytalZl;
import com.sinfusi.freedom.rm.example.RmPenaltytalZlExample;
import com.sinfusi.freedom.rm.criteria.RmPenaltytalZlCriteria;

/**
 * rm_penaltytal_zl Dao接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
public interface IRmPenaltytalZlDao extends IBaseDao<RmPenaltytalZlExample,RmPenaltytalZlCriteria, RmPenaltytalZl> {
    void createOrUpdate(RmPenaltytalZl rmRentplantabZl);
}