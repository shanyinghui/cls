package com.sinfusi.freedom.rm.service.impl;

import com.sinfusi.freedom.core.base.service.impl.AbstractServiceImpl;
import com.sinfusi.freedom.rm.dao.IRmNormalpriceDao;
import com.sinfusi.freedom.rm.entity.RmNormalprice;
import com.sinfusi.freedom.rm.service.IRmNormalpriceService;
import com.sinfusi.freedom.rm.service.dto.RmNormalpriceDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * rm_normalprice Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:41:36.724
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RmNormalpriceServiceImpl extends AbstractServiceImpl<RmNormalpriceDTO, RmNormalprice, IRmNormalpriceDao> implements IRmNormalpriceService {
}
