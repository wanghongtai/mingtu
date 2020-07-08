package com.mingtu.controller.industry;

import com.mingtu.common.entity.BrandLargeType;
import com.mingtu.common.entity.IndusInfo;
import com.mingtu.common.entity.vo.IndusInfoVo;
import com.mingtu.common.service.IndusInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hunter on 2020-07-08.
 */
@RestController
@RequestMapping("/industry")
public class industryController {


    @Autowired
    private IndusInfoService indusInfoService;

    /**
     * 行业列表
     * @return
     */
    @RequestMapping("/list")
    public List<IndusInfoVo> list(IndusInfoVo vo){
        return indusInfoService.findByItemWithAllCateList(vo);
    }

}
