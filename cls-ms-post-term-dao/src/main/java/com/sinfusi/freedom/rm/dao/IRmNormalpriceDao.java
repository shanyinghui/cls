package com.sinfusi.freedom.rm.dao;

import com.sinfusi.freedom.core.base.dao.IBaseDao;
import com.sinfusi.freedom.rm.entity.RmNormalprice;
import com.sinfusi.freedom.rm.example.RmNormalpriceExample;
import com.sinfusi.freedom.rm.criteria.RmNormalpriceCriteria;

/**
 * rm_normalprice Dao接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
public interface IRmNormalpriceDao extends IBaseDao<RmNormalpriceExample,RmNormalpriceCriteria, RmNormalprice> {
    void createOrUpdate(RmNormalprice rmNormalprice);
}