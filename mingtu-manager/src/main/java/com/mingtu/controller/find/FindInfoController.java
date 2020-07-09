package com.mingtu.controller.find;

import com.mingtu.common.entity.FindInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.FindInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunter on 2020-07-09.
 */
@RestController
@RequestMapping("/findInfo")
public class FindInfoController {

    @Autowired
    private FindInfoService findInfoService;
    /**
     * 获取列表
     * @return
     */
    @RequestMapping("/list")
    public PagingResult<FindInfo> list(FindInfo item, LayuiPage page){
        return findInfoService.findByItem(item, page);
    }

    /**
     * 添加记录
     * @return
     */
    @RequestMapping("/save")
    public Object list(FindInfo item){
        return findInfoService.save(item);
    }

}
