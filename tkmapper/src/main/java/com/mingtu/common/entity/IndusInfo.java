package com.mingtu.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "indus_info")
public class IndusInfo {
    @Id
    private Long id;

    /**
     * 行业名字不重复
     */
    private String name;

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
     * 获取行业名字不重复
     *
     * @return name - 行业名字不重复
     */
    public String getName() {
        return name;
    }

    /**
     * 设置行业名字不重复
     *
     * @param name 行业名字不重复
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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