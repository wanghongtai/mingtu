package com.mingtu.common.service;


import com.mingtu.common.entity.BrandSmallType;
import com.mingtu.common.entity.vo.BrandSmallTypeVo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;

import java.util.List;

public interface BrandSmallTypeService {

	BrandSmallType getBrandSmallType(String smallNo);

	BrandSmallType getBrandSmallType(Long SmallTypeId);

	int saveBrandSmallType(BrandSmallType brandSmallType);

	int deleteBrandSmallType(BrandSmallType brandSmallType);

	PagingResult<BrandSmallType> findBrandSmallType(BrandSmallTypeVo brandSmallType, LayuiPage page);

	List<BrandSmallType> findBrandSmallTypeList(BrandSmallTypeVo brandSmallType);
}