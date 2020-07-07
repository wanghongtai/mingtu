package com.mingtu.controller;

import com.mingtu.common.service.SysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunter on 2020-07-03.
 */
@RestController
@RequestMapping("/sysInfo")
public class SysInfoController {

    @Autowired
    private SysInfoService sysInfoService;
//    @Autowired
//    private SysInfoService sysInfoService;

    @RequestMapping("/count")
    public Object count() {
        int count = sysInfoService.accessCount();
        return 53675 + count;
    }

    @RequestMapping("/todayCount")
    public int todayCount() {
        return 1586 + sysInfoService.todayAccessCount();
    }


}
