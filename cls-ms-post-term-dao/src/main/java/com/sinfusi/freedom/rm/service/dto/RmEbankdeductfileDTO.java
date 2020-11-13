package com.sinfusi.freedom.rm.service.dto;

import com.sinfusi.freedom.convert.annotation.CacheDict;
import com.sinfusi.freedom.core.base.dto.BaseDTO;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * rm_ebankdeductfileDTO类
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RmEbankdeductfileDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * cust_class_id
     */
    private String custClassId;
    @CacheDict(keyProperty = "custClassId")
    private String custClassIName;
    /**
     * ebank_name
     */
    private String ebankName;
    /**
     * make_amt
     */
    private BigDecimal makeAmt;
    /**
     * make_count
     */
    private Integer makeCount;
    /**
     * make_file_path
     */
    private String makeFilePath;
    /**
     * make_file_name
     */
    private String makeFileName;
    /**
     * make_time
     */
    private LocalDateTime makeTime;
    /**
     * maker
     */
    private String maker;
    /**
     * back_time
     */
    private LocalDateTime backTime;
    /**
     * uploader
     */
    private String uploader;
    /**
     * back_file_path
     */
    private String backFilePath;
    /**
     * back_file_name
     */
    private String backFileName;
    /**
     * back_amt
     */
    private BigDecimal backAmt;
    /**
     * back_count
     */
    private Integer backCount;
    /**
     * scount
     */
    private Integer scount;
    /**
     * samt
     */
    private BigDecimal samt;
    /**
     * data_state_id
     */
    private String dataStateId;
    @CacheDict(keyProperty = "dataStateId")
    private String dataStateName;
    /**
     * state_id
     */
    private String stateId;
    @CacheDict(keyProperty = "stateId")
    private String stateName;

    /**
     * 关联id
     */
    private String relId;

    /**
     * 关联id
     */
    private String costTypeId;


    private String custClassName;

}