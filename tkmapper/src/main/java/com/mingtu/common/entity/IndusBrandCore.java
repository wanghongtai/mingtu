package com.mingtu.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "indus_brand_core")
public class IndusBrandCore {
    @Id
    private Long id;

    /**
     * indus_info表id
     */
    @Column(name = "indus_info_id")
    private Long indusInfoId;

    /**
     * brand_large_type表id
     */
    @Column(name = "brand_large_type_id")
    private Long brandLargeTypeId;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取indus_info表id
     *
     * @return indus_info_id - indus_info表id
     */
    public Long getIndusInfoId() {
        return indusInfoId;
    }

    /**
     * 设置indus_info表id
     *
     * @param indusInfoId indus_info表id
     */
    public void setIndusInfoId(Long indusInfoId) {
        this.indusInfoId = indusInfoId;
    }

    /**
     * 获取brand_large_type表id
     *
     * @return brand_large_type_id - brand_large_type表id
     */
    public Long getBrandLargeTypeId() {
        return brandLargeTypeId;
    }

    /**
     * 设置brand_large_type表id
     *
     * @param brandLargeTypeId brand_large_type表id
     */
    public void setBrandLargeTypeId(Long brandLargeTypeId) {
        this.brandLargeTypeId = brandLargeTypeId;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}