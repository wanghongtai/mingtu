package com.mingtu.common.entity;

import javax.persistence.*;

@Table(name = "sys_info")
public class SysInfo {
    @Id
    private Integer id;

    @Column(name = "access_count")
    private Integer accessCount;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
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