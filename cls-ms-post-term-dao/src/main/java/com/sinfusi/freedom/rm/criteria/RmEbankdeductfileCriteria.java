package com.sinfusi.freedom.rm.criteria;

import com.sinfusi.freedom.core.base.criteria.BaseCriteria;
import com.sinfusi.freedom.core.filter.StringFilter;
import com.sinfusi.freedom.core.filter.BigDecimalFilter;
import com.sinfusi.freedom.core.filter.IntegerFilter;
import com.sinfusi.freedom.core.filter.LocalDateTimeFilter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * rm_ebankdeductfile标准查询对象
 * <p></p>
 *
 * @author syh
 * @since 2020-11-11T14:34:09.527
 */
@Getter
@Setter
@ToString(callSuper = true)
public class RmEbankdeductfileCriteria extends BaseCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private StringFilter id;
    /**
     * cust_class_id
     */
    private StringFilter custClassId;
    /**
     * ebank_name
     */
    private StringFilter ebankName;
    /**
     * make_amt
     */
    private BigDecimalFilter makeAmt;
    /**
     * make_count
     */
    private IntegerFilter makeCount;
    /**
     * make_file_path
     */
    private StringFilter makeFilePath;
    /**
     * make_file_name
     */
    private StringFilter makeFileName;
    /**
     * make_time
     */
    private LocalDateTimeFilter makeTime;
    /**
     * maker
     */
    private StringFilter maker;
    /**
     * back_time
     */
    private LocalDateTimeFilter backTime;
    /**
     * uploader
     */
    private StringFilter uploader;
    /**
     * back_file_path
     */
    private StringFilter backFilePath;
    /**
     * back_file_name
     */
    private StringFilter backFileName;
    /**
     * back_amt
     */
    private BigDecimalFilter backAmt;
    /**
     * back_count
     */
    private IntegerFilter backCount;
    /**
     * scount
     */
    private IntegerFilter scount;
    /**
     * samt
     */
    private BigDecimalFilter samt;
    /**
     * data_state_id
     */
    private StringFilter dataStateId;
    /**
     * state_id
     */
    private StringFilter stateId;
    /**
     * cost_type_id
     */
    private StringFilter costTypeId;
    /**
     * rel_id
     */
    private StringFilter relId;
}