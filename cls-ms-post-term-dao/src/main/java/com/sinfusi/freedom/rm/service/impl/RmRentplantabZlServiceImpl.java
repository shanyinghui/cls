package com.sinfusi.freedom.rm.service.impl;

import com.sinfusi.freedom.core.base.service.impl.AbstractServiceImpl;
import com.sinfusi.freedom.core.utils.Assert;
import com.sinfusi.freedom.core.utils.CommUtils;
import com.sinfusi.freedom.rm.dao.IRmRentplantabZlDao;
import com.sinfusi.freedom.rm.entity.RmRentplantabZl;
import com.sinfusi.freedom.rm.example.RmRentplantabZlExample;
import com.sinfusi.freedom.rm.service.IRmRentplantabZlService;
import com.sinfusi.freedom.rm.service.dto.RmRentplantabZlDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * rm_rentplantab_zl Dao实现类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RmRentplantabZlServiceImpl extends AbstractServiceImpl<RmRentplantabZlDTO, RmRentplantabZl, IRmRentplantabZlDao> implements IRmRentplantabZlService {
    @Autowired
    private IRmRentplantabZlDao rmRentplantabZlDao;

    /**
     * 条件查询 租金支付表集合
     *
     * @param rmRentplantabZlExample
     * @return
     */
    @Override
    public List<RmRentplantabZlDTO> selectByExample(RmRentplantabZlExample rmRentplantabZlExample) {
        return convertUtil.toDTO(this.rmRentplantabZlDao.selectByExample(rmRentplantabZlExample), RmRentplantabZlDTO.class);
    }

    /**
     * 创建/更新.
     *
     * @param rmRentplantabZlDTO
     * @return
     */
    @Override
    public RmRentplantabZlDTO createOrUpdate(RmRentplantabZlDTO rmRentplantabZlDTO) {
        RmRentplantabZl rmRentplantabZl = convertUtil.toEntity(rmRentplantabZlDTO, RmRentplantabZl.class);
        if (CommUtils.isEmptyStr(rmRentplantabZl.getId())) {
            int result = this.rmRentplantabZlDao.insert(rmRentplantabZl);
            Assert.notEquals(result, 0, "新建失败!");
        } else {
            int result = this.rmRentplantabZlDao.update(rmRentplantabZl);
            Assert.notEquals(result, 0, "更新失败!");
        }
        return convertUtil.toDTO(rmRentplantabZl, RmRentplantabZlDTO.class);
    }
}
