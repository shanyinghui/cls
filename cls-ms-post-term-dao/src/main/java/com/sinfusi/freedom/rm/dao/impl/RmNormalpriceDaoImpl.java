package com.sinfusi.freedom.rm.dao.impl;

import com.sinfusi.freedom.core.base.dao.impl.AbstractBaseDaoImpl;
import com.sinfusi.freedom.core.utils.Assert;
import com.sinfusi.freedom.core.utils.CommUtils;
import com.sinfusi.freedom.rm.criteria.RmNormalpriceCriteria;
import com.sinfusi.freedom.rm.dao.IRmNormalpriceDao;
import com.sinfusi.freedom.rm.entity.RmNormalprice;
import com.sinfusi.freedom.rm.example.RmNormalpriceExample;
import com.sinfusi.freedom.rm.mapper.IRmNormalpriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * rm_normalprice Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
@Repository
public class RmNormalpriceDaoImpl extends AbstractBaseDaoImpl<RmNormalpriceExample,RmNormalpriceCriteria, RmNormalprice, IRmNormalpriceMapper> implements IRmNormalpriceDao {

    @Autowired
    private IRmNormalpriceMapper rmNormalpriceMapper;

    /**
     * 创建/更新.
     *
     * @param rmNormalprice
     * @return
     */
    @Override
    public void createOrUpdate(RmNormalprice rmNormalprice) {
        if (CommUtils.isEmptyStr(rmNormalprice.getId())) {
            int result = this.rmNormalpriceMapper.insert(rmNormalprice);
            Assert.notEquals(result, 0, "新建失败!");
        } else {
            int result = this.rmNormalpriceMapper.update(rmNormalprice);
            Assert.notEquals(result, 0, "更新失败!");
        }
    }
}