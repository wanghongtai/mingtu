package com.mingtu.controller;

import com.mingtu.common.entity.SysAccess;
import com.mingtu.common.service.SysAccessService;
import com.mingtu.common.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Hunter on 2020-07-03.
 */
@RestController
@RequestMapping("/sysAcc")
public class SysAccessController {

    @Autowired
    private SysAccessService sysAccessService;

    /*@ResponseBody
    @RequestMapping("/getItem")
    public Object getItem(SysAccess item){
        PagingResult<SysAccess> pagingResult = sysAccessService.findByItem(item, null);
        return pagingResult;
    }*/

    @RequestMapping("/saveItem")
    public Object saveItem(SysAccess item, HttpServletRequest request){
        String ipAddress = HttpUtil.getIpAddress(request);
        item.setAccessIp(ipAddress);
        int count = sysAccessService.save(item);
        return count;
    }
}
