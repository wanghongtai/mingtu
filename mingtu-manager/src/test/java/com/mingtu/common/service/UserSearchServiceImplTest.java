package com.mingtu.common.service;

import com.mingtu.common.entity.UserInfo;
import com.mingtu.common.entity.UserSearch;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hunter on 2020-07-11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserSearchServiceImplTest {

    @Autowired
    private UserSearchService userSearchService;

    @Test
    public void test(){
        UserSearch item = userSearchService.getById(1L);
        System.out.println(item);
    }

    @Test
    public void test2(){
        UserSearch item = new UserSearch();
        item.setCname("cc");
        item.setTel("123456789");
        int count = userSearchService.save(item);
        System.out.println(count);
    }

    @Test
    public void test3(){
        UserSearch item = new UserSearch();
        LayuiPage page = new LayuiPage();
        PagingResult<UserSearch> result = userSearchService.findByItem(item, page);
        System.out.println(result.getTotalCount());
        for (UserSearch userSearch:result.getList()){
            System.out.println(userSearch);
        }
    }

}
