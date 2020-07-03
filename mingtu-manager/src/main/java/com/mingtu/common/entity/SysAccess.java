package com.mingtu.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sys_access")
public class SysAccess {
    @Id
    @Column(name = "access_id")
    private Long accessId;

    @Column(name = "accessI_date")
    private Date accessiDate;

    @Column(name = "access_total")
    private Integer accessTotal;

    @Column(name = "access_effective")
    private Integer accessEffective;

    @Column(name = "access_ip")
    private String accessIp;

    /**
     * @return access_id
     */
    public Long getAccessId() {
        return accessId;
    }

    /**
     * @param accessId
     */
    public void setAccessId(Long accessId) {
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

    /**
     * @return access_ip
     */
    public String getAccessIp() {
        return accessIp;
    }

    /**
     * @param accessIp
     */
    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp == null ? null : accessIp.trim();
    }
}