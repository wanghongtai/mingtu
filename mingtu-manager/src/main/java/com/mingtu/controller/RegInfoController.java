package com.mingtu.controller;

import com.mingtu.common.entity.RegInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.RegInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hunter on 2020-07-03.
 */
@Controller
@RequestMapping("/regInfo")
public class RegInfoController {

    @Autowired
    private RegInfoService regInfoService;

    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        RegInfo regInfo = new RegInfo();
        LayuiPage layuiPage = new LayuiPage();
        PagingResult<RegInfo> pagingResult = regInfoService.findByItem(regInfo, layuiPage);
        return pagingResult;
    }

    @ResponseBody
    @RequestMapping("/getItem")
    public Object getItem(RegInfo item){
        PagingResult<RegInfo> pagingResult = regInfoService.findByItem(item, null);
        return pagingResult;
    }

    @ResponseBody
    @RequestMapping("/saveItem")
    public Object saveItem(RegInfo item){
        int count = regInfoService.save(item);
        return count;
    }

    @ResponseBody
    @RequestMapping("/existItem")
    public Object existItem(RegInfo item){
        boolean exist = regInfoService.exist(item);
        return exist;
    }

}
