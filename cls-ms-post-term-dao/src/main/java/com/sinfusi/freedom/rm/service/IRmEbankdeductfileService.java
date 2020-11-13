package com.sinfusi.freedom.rm.service;

import com.sinfusi.freedom.core.base.service.IService;
import com.sinfusi.freedom.rm.service.dto.RmEbankdeductfileDTO;


/**
 * rm_ebankdeductfile Service
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
public interface IRmEbankdeductfileService extends IService<RmEbankdeductfileDTO> {
    /**
     * 保存
     *
     * @param rmEbankdeductfileDTO
     * @return
     */
    RmEbankdeductfileDTO save(RmEbankdeductfileDTO rmEbankdeductfileDTO);
}
