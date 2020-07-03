package com.mingtu.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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

    @Override
    public String toString() {
        return "RegInfo{" +
                "regId=" + regId +
                ", brandname='" + brandname + '\'' +
                ", countryId=" + countryId +
                ", regPhone='" + regPhone + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}