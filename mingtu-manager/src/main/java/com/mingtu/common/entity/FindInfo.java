package com.mingtu.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "find_info")
public class FindInfo {
    @Id
    @Column(name = "find_id")
    private Integer findId;

    @Column(name = "find_brand_name")
    private String findBrandName;

    @Column(name = "find_conuntry_name")
    private String findConuntryName;

    @Column(name = "find_phone")
    private String findPhone;

    @Column(name = "find_create_date")
    private Date findCreateDate;

    /**
     * @return find_id
     */
    public Integer getFindId() {
        return findId;
    }

    /**
     * @param findId
     */
    public void setFindId(Integer findId) {
        this.findId = findId;
    }

    /**
     * @return find_brand_name
     */
    public String getFindBrandName() {
        return findBrandName;
    }

    /**
     * @param findBrandName
     */
    public void setFindBrandName(String findBrandName) {
        this.findBrandName = findBrandName == null ? null : findBrandName.trim();
    }

    /**
     * @return find_conuntry_name
     */
    public String getFindConuntryName() {
        return findConuntryName;
    }

    /**
     * @param findConuntryName
     */
    public void setFindConuntryName(String findConuntryName) {
        this.findConuntryName = findConuntryName == null ? null : findConuntryName.trim();
    }

    /**
     * @return find_phone
     */
    public String getFindPhone() {
        return findPhone;
    }

    /**
     * @param findPhone
     */
    public void setFindPhone(String findPhone) {
        this.findPhone = findPhone == null ? null : findPhone.trim();
    }

    /**
     * @return find_create_date
     */
    public Date getFindCreateDate() {
        return findCreateDate;
    }

    /**
     * @param findCreateDate
     */
    public void setFindCreateDate(Date findCreateDate) {
        this.findCreateDate = findCreateDate;
    }

    @Override
    public String toString() {
        return "FindInfo{" +
                "findId=" + findId +
                ", findBrandName='" + findBrandName + '\'' +
                ", findConuntryName='" + findConuntryName + '\'' +
                ", findPhone='" + findPhone + '\'' +
                ", findCreateDate=" + findCreateDate +
                '}';
    }
}