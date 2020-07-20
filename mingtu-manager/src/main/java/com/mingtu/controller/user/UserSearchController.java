package com.mingtu.controller.user;

import com.mingtu.common.entity.UserSearch;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import com.mingtu.common.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hunter on 2020-07-11.
 */
@RestController
@RequestMapping("/userSearch")
public class UserSearchController {

    @Autowired
    private UserSearchService userSearchService;

    @RequestMapping("/list")
    public Object list(LayuiPage layuiPage){
        UserSearch item = new UserSearch();
        PagingResult<UserSearch> pagingResult = userSearchService.findByItem(item, layuiPage);
        return pagingResult;
    }


    @RequestMapping("/saveItem")
    public Object saveItem(UserSearch item){
        int count = userSearchService.save(item);
        return count;
    }
}
