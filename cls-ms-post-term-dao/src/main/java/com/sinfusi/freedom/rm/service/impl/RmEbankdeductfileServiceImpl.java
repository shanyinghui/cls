package com.sinfusi.freedom.rm.service.impl;

import com.sinfusi.freedom.core.base.service.impl.AbstractServiceImpl;
import com.sinfusi.freedom.core.utils.Assert;
import com.sinfusi.freedom.rm.dao.IRmEbankdeductfileDao;
import com.sinfusi.freedom.rm.entity.RmEbankdeductfile;
import com.sinfusi.freedom.rm.service.IRmEbankdeductfileService;
import com.sinfusi.freedom.rm.service.dto.RmEbankdeductfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * rm_ebankdeductfile Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RmEbankdeductfileServiceImpl extends AbstractServiceImpl<RmEbankdeductfileDTO, RmEbankdeductfile, IRmEbankdeductfileDao> implements IRmEbankdeductfileService {
    @Autowired
    private IRmEbankdeductfileDao iRmEbankdeductfileDao;

    /**
     * 保存
     *
     * @param rmEbankdeductfileDTO
     * @return
     */
    @Override
    public RmEbankdeductfileDTO save(RmEbankdeductfileDTO rmEbankdeductfileDTO) {
        RmEbankdeductfile rmEbankdeductfile = this.convertUtil.toEntity(rmEbankdeductfileDTO, RmEbankdeductfile.class);
        RmEbankdeductfile rmEbankdeductfile1 = this.iRmEbankdeductfileDao.selectById(rmEbankdeductfile.getId());
        if (rmEbankdeductfile1 != null) {
            int result = this.iRmEbankdeductfileDao.update(rmEbankdeductfile);
            Assert.notEquals(result, 0, "修改信息失败.");
        } else {
            int result = this.iRmEbankdeductfileDao.insert(rmEbankdeductfile);
            Assert.notEquals(result, 0, "增加信息失败.");
        }
        return this.convertUtil.toDTO(rmEbankdeductfile, RmEbankdeductfileDTO.class);
    }
}
