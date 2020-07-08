package com.mingtu.controller.brand;

import com.mingtu.common.entity.BrandSmallType;
import com.mingtu.common.entity.vo.BrandSmallTypeVo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.BrandSmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brandSmallType")
public class BrandSmallTypeAction {

    @Autowired
    private BrandSmallTypeService brandSmallTypeService;

    /**
     * 商标主页
     *
     * @param page
     * @return
     */
    @RequestMapping("/list")
    public PagingResult list(LayuiPage page, Long largeTypeId, String filter) {
        //page.setLimit(60);
        //加载大类及子类
        BrandSmallTypeVo type = new BrandSmallTypeVo();
        type.setLargeTypeId(largeTypeId);
        type.setFilter(filter);
        PagingResult<BrandSmallType> pageResult = brandSmallTypeService.findBrandSmallType(type, page);
        return pageResult;
    }

}
