package com.mingtu.common.service;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

import java.util.List;


public interface BrandLargeTypeService {

    BrandLargeType getBrandLargeType(Long id);

    int saveBrandLargeType(BrandLargeType brandLargeType);

    int deleteBrandLargeType(BrandLargeType brandLargeType);

    PagingResult<BrandLargeType> findBrandLargeType(BrandLargeType brandLargeType, LayuiPage page);
    
    List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type);
}