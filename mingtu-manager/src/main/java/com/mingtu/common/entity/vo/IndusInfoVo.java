package com.mingtu.common.entity.vo;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.IndusInfo;

import java.util.List;

/**
 * Created by Hunter on 2020-07-08.
 */
public class IndusInfoVo extends IndusInfo {

    private String filter;
    private List<BrandLargeType> coreCateList;
    private List<BrandLargeType> relateCateList;


    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<BrandLargeType> getCoreCateList() {
        return coreCateList;
    }

    public void setCoreCateList(List<BrandLargeType> coreCateList) {
        this.coreCateList = coreCateList;
    }

    public List<BrandLargeType> getRelateCateList() {
        return relateCateList;
    }

    public void setRelateCateList(List<BrandLargeType> relateCateList) {
        this.relateCateList = relateCateList;
    }

    @Override
    public String toString() {
        return "IndusInfoVo{" +
                "filter='" + filter + '\'' +
                ", coreCateList=" + coreCateList +
                ", relateCateList=" + relateCateList +
                '}';
    }
}
