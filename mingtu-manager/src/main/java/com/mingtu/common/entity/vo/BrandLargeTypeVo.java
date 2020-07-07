package com.mingtu.common.entity.vo;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.BrandSmallType;

import java.util.List;

/**
 * Created by Hunter on 2020-07-07.
 */
public class BrandLargeTypeVo extends BrandLargeType {

    private String filter;
    private List<BrandSmallType> brandSmallTypeList;

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<BrandSmallType> getBrandSmallTypeList() {
        return brandSmallTypeList;
    }

    public void setBrandSmallTypeList(List<BrandSmallType> brandSmallTypeList) {
        this.brandSmallTypeList = brandSmallTypeList;
    }

    @Override
    public String toString() {
        return "BrandLargeTypeVo{" +
                "filter='" + filter + '\'' +
                ", brandSmallTypeList=" + brandSmallTypeList +
                '}';
    }
}
