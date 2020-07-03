package com.mingtu.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_info")
public class SysInfo {
    @Id
    private Long id;

    @Column(name = "access_count")
    private Integer accessCount;

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
     * @return access_count
     */
    public Integer getAccessCount() {
        return accessCount;
    }

    /**
     * @param accessCount
     */
    public void setAccessCount(Integer accessCount) {
        this.accessCount = accessCount;
    }
}