package com.mingtu.common.paging;

/**
 * Created by Hunter on 2020-06-22.
 */
public class Page {

    private Integer pageNo;
    private Integer limit;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
