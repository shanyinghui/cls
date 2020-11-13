package com.sinfusi.freedom.rm.mapper;

import com.sinfusi.freedom.core.base.mapper.MyBatisBaseMapper;
import com.sinfusi.freedom.rm.entity.RmPenaltytalZl;
import com.sinfusi.freedom.rm.example.RmPenaltytalZlExample;
import com.sinfusi.freedom.rm.criteria.RmPenaltytalZlCriteria;
import org.apache.ibatis.annotations.Mapper;

/**
 * rm_penaltytal_zl MyBatis接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
@Mapper
public interface IRmPenaltytalZlMapper extends MyBatisBaseMapper<RmPenaltytalZlExample,RmPenaltytalZlCriteria, RmPenaltytalZl> {
}