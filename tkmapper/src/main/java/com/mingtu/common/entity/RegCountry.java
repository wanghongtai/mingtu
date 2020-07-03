package com.mingtu.common.entity;

import javax.persistence.*;

@Table(name = "reg_country")
public class RegCountry {
    @Id
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "countryName")
    private String countryname;

    @Column(name = "countryENName")
    private String countryenname;

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
     * @return countryName
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * @param countryname
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname == null ? null : countryname.trim();
    }

    /**
     * @return countryENName
     */
    public String getCountryenname() {
        return countryenname;
    }

    /**
     * @param countryenname
     */
    public void setCountryenname(String countryenname) {
        this.countryenname = countryenname == null ? null : countryenname.trim();
    }
}