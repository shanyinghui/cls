package com.sinfusi.freedom.rm.mapper;

import com.sinfusi.freedom.core.base.mapper.MyBatisBaseMapper;
import com.sinfusi.freedom.rm.entity.RmNormalprice;
import com.sinfusi.freedom.rm.example.RmNormalpriceExample;
import com.sinfusi.freedom.rm.criteria.RmNormalpriceCriteria;
import org.apache.ibatis.annotations.Mapper;

/**
 * rm_normalprice MyBatis接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
@Mapper
public interface IRmNormalpriceMapper extends MyBatisBaseMapper<RmNormalpriceExample,RmNormalpriceCriteria, RmNormalprice> {
}