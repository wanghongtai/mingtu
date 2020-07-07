package com.mingtu.common.entity.vo;

import com.mingtu.common.entity.BrandSmallType;

/**
 * Created by Hunter on 2020-07-07.
 */
public class BrandSmallTypeVo extends BrandSmallType{

    //查询关键字
    private String filter;


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
