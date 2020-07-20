package com.mingtu.common.service;

import com.mingtu.common.entity.RegInfo;
import com.mingtu.common.entity.UserInfo;
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
public class UserInfoServiceImplTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void test(){
        UserInfo item = userInfoService.getById(1L);
        System.out.println(item);
    }

    @Test
    public void test2(){
        UserInfo item = new UserInfo();
        item.setUname("bb");
        item.setTel("123456789");
        int count = userInfoService.save(item);
        System.out.println(count);
    }

    @Test
    public void test3(){
        UserInfo item = new UserInfo();
        LayuiPage page = new LayuiPage();
        PagingResult<UserInfo> result = userInfoService.findByItem(item, page);
        System.out.println(result.getTotalCount());
        for (UserInfo userInfo:result.getList()){
            System.out.println(userInfo);
        }
    }

}
