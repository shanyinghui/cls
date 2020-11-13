package com.sinfusi.freedom.rm.service;


import com.sinfusi.freedom.rm.service.dto.OmAbnormalendDTO;

public interface IOmAbnormalendService {

    /**
     * 通过主键查询
     *
     * @param id
     * @return
     */
    OmAbnormalendDTO findOne(String id);

    /**
     * 创建/更新.
     *
     * @param omAbnormalendDTO
     * @return
     */
    OmAbnormalendDTO createOrUpdate(OmAbnormalendDTO omAbnormalendDTO);


}

