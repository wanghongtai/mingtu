package com.mingtu.controller.brand;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.service.BrandLargeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brandLargeType")
public class BrandLargeTypeAction {
	
	@Autowired
	private BrandLargeTypeService brandLargeTypeService;
	
	/**
	 * 获取商标大类列表
	 * @return
	 */
	@RequestMapping("/findBrandLargeTypeList")
	public List<BrandLargeType> findBrandLargeTypeList(BrandLargeType type){
		return brandLargeTypeService.findBrandLargeTypeList(type);
	}

}
