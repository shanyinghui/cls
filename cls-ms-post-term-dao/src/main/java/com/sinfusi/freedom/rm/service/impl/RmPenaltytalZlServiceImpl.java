package com.sinfusi.freedom.rm.service.impl;

import com.sinfusi.freedom.core.base.service.impl.AbstractServiceImpl;
import com.sinfusi.freedom.rm.dao.IRmPenaltytalZlDao;
import com.sinfusi.freedom.rm.entity.RmPenaltytalZl;
import com.sinfusi.freedom.rm.service.IRmPenaltytalZlService;
import com.sinfusi.freedom.rm.service.dto.RmPenaltytalZlDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * rm_penaltytal_zl Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:39:22.305
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RmPenaltytalZlServiceImpl extends AbstractServiceImpl<RmPenaltytalZlDTO, RmPenaltytalZl, IRmPenaltytalZlDao> implements IRmPenaltytalZlService {
}
