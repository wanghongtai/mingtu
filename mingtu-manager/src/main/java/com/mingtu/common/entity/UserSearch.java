package com.mingtu.common.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user_search")
public class UserSearch {
    @Id
    private Long id;

    /**
     * 查询的商标国家和类别
     */
    private String cname;

    private String tel;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取查询的商标国家和类别
     *
     * @return cname - 查询的商标国家和类别
     */
    public String getCname() {
        return cname;
    }

    /**
     * 设置查询的商标国家和类别
     *
     * @param cname 查询的商标国家和类别
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}