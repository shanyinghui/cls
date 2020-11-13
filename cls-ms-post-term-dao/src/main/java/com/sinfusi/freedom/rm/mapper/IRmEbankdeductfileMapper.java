package com.sinfusi.freedom.rm.mapper;

import com.sinfusi.freedom.core.base.mapper.MyBatisBaseMapper;
import com.sinfusi.freedom.rm.entity.RmEbankdeductfile;
import com.sinfusi.freedom.rm.example.RmEbankdeductfileExample;
import com.sinfusi.freedom.rm.criteria.RmEbankdeductfileCriteria;
import org.apache.ibatis.annotations.Mapper;

/**
 * rm_ebankdeductfile MyBatis接口
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
@Mapper
public interface IRmEbankdeductfileMapper extends MyBatisBaseMapper<RmEbankdeductfileExample,RmEbankdeductfileCriteria, RmEbankdeductfile> {
}