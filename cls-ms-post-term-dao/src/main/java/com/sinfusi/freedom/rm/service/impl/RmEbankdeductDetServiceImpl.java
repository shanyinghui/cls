package com.sinfusi.freedom.rm.service.impl;

import com.sinfusi.freedom.core.base.service.impl.AbstractServiceImpl;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductDetDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductDet;
import com.sinfusi.freedom.rm.service.IRmEbankdeductDetService;
import com.sinfusi.freedom.rm.service.dto.RmEbankdeductDetDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * rm_ebankdeduct_det Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T13:37:49.755
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RmEbankdeductDetServiceImpl extends AbstractServiceImpl<RmEbankdeductDetDTO, RmEbankdeductDet, IRmEbankdeductDetDao> implements IRmEbankdeductDetService {
}
