package com.mingtu.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_access")
public class SysAccess {
    @Id
    @Column(name = "access_id")
    private Integer accessId;

    @Column(name = "accessI_date")
    private Date accessiDate;

    @Column(name = "access_total")
    private Integer accessTotal;

    @Column(name = "access_effective")
    private Integer accessEffective;

    /**
     * @return access_id
     */
    public Integer getAccessId() {
        return accessId;
    }

    /**
     * @param accessId
     */
    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    /**
     * @return accessI_date
     */
    public Date getAccessiDate() {
        return accessiDate;
    }

    /**
     * @param accessiDate
     */
    public void setAccessiDate(Date accessiDate) {
        this.accessiDate = accessiDate;
    }

    /**
     * @return access_total
     */
    public Integer getAccessTotal() {
        return accessTotal;
    }

    /**
     * @param accessTotal
     */
    public void setAccessTotal(Integer accessTotal) {
        this.accessTotal = accessTotal;
    }

    /**
     * @return access_effective
     */
    public Integer getAccessEffective() {
        return accessEffective;
    }

    /**
     * @param accessEffective
     */
    public void setAccessEffective(Integer accessEffective) {
        this.accessEffective = accessEffective;
    }
}