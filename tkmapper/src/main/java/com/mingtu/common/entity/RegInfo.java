package com.mingtu.common.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "reg_info")
public class RegInfo {
    @Id
    @Column(name = "reg_id")
    private Long regId;

    @Column(name = "brandName")
    private String brandname;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "reg_phone")
    private String regPhone;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "country_name")
    private String countryName;

    private String refer;

    /**
     * @return reg_id
     */
    public Long getRegId() {
        return regId;
    }

    /**
     * @param regId
     */
    public void setRegId(Long regId) {
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
    public String getRegPhone() {
        return regPhone;
    }

    /**
     * @param regPhone
     */
    public void setRegPhone(String regPhone) {
        this.regPhone = regPhone == null ? null : regPhone.trim();
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

    /**
     * @return country_name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName == null ? null : countryName.trim();
    }

    /**
     * @return refer
     */
    public String getRefer() {
        return refer;
    }

    /**
     * @param refer
     */
    public void setRefer(String refer) {
        this.refer = refer == null ? null : refer.trim();
    }
}