package com.mingtu.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "reg_info")
public class RegInfo {
    @Id
    @Column(name = "reg_id")
    private Integer regId;

    @Column(name = "brandName")
    private String brandname;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "reg_phone")
    private Integer regPhone;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * @return reg_id
     */
    public Integer getRegId() {
        return regId;
    }

    /**
     * @param regId
     */
    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    /**
     * @return brandName
     */
    public String getBrandname() {
        return brandname;
    }

    /**
     * @param brandname
     */
    public void setBrandname(String brandname) {
        this.brandname = brandname == null ? null : brandname.trim();
    }

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * @return reg_phone
     */
    public Integer getRegPhone() {
        return regPhone;
    }

    /**
     * @param regPhone
     */
    public void setRegPhone(Integer regPhone) {
        this.regPhone = regPhone;
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