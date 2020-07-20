package com.mingtu.controller.user;

import com.mingtu.common.entity.UserInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunter on 2020-07-11.
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/list")
    public Object list(LayuiPage layuiPage){
        UserInfo item = new UserInfo();
        PagingResult<UserInfo> pagingResult = userInfoService.findByItem(item, layuiPage);
        return pagingResult;
    }


    @RequestMapping("/saveItem")
    public Object saveItem(UserInfo item){
        int count = userInfoService.save(item);
        return count;
    }
}
