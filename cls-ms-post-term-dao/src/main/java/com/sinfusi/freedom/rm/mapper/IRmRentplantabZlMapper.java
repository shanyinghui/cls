package com.sinfusi.freedom.rm.mapper;

import com.sinfusi.freedom.core.base.mapper.MyBatisBaseMapper;
import com.sinfusi.freedom.rm.entity.RmRentplantabZl;
import com.sinfusi.freedom.rm.example.RmRentplantabZlExample;
import com.sinfusi.freedom.rm.criteria.RmRentplantabZlCriteria;
import org.apache.ibatis.annotations.Mapper;

/**
 * rm_rentplantab_zl MyBatis接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
@Mapper
public interface IRmRentplantabZlMapper extends MyBatisBaseMapper<RmRentplantabZlExample,RmRentplantabZlCriteria, RmRentplantabZl> {
}