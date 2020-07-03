package com.mingtu.controller;

import com.mingtu.common.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Hunter on 2020-07-03.
 */
@Controller
@RequestMapping("/sysInfo")
public class SysInfoController {

    @Autowired
    private SysInfoService sysInfoService;

    @ResponseBody
    @RequestMapping("/count")
    public Object list() {
        int count = sysInfoService.count();
        return count;
    }
}
