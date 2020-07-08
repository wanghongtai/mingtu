package com.mingtu.controller.brand;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.vo.BrandLargeTypeVo;
import com.mingtu.common.paging.PagingResult;
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
	@RequestMapping("/list")
	public List<BrandLargeType> list(BrandLargeType type){
		return brandLargeTypeService.findBrandLargeTypeList(type);
	}

	/**
	 * 获取商标大类列表
	 * @return
	 */
	@RequestMapping("/listWithSmall")
	public List<BrandLargeTypeVo> listWithSmall(BrandLargeTypeVo type){
		return brandLargeTypeService.findBrandLargeTypeVo(type);
	}

}
