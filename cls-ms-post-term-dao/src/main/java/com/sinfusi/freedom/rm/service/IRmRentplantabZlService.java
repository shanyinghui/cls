package com.sinfusi.freedom.rm.service;

import com.sinfusi.freedom.core.base.service.IService;
import com.sinfusi.freedom.rm.example.RmRentplantabZlExample;
import com.sinfusi.freedom.rm.service.dto.RmRentplantabZlDTO;

import java.util.List;


/**
 * rm_rentplantab_zl Service
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:35:38.653
 */
public interface IRmRentplantabZlService extends IService<RmRentplantabZlDTO> {

    /**
     * 条件查询 租金支付表集合
     *
     * @param rmRentplantabZlExample
     * @return
     */
    List<RmRentplantabZlDTO> selectByExample(RmRentplantabZlExample rmRentplantabZlExample);

    RmRentplantabZlDTO createOrUpdate(RmRentplantabZlDTO rmRentplantabZlDTO);
}
