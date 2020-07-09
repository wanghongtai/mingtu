package com.mingtu.common.service;

import com.mingtu.common.entity.FindInfo;
import com.mingtu.common.paging.LayuiPage;
import com.mingtu.common.paging.PagingResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by Hunter on 2020-07-09.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FindInfoServiceImplTest {

    @Autowired
    private FindInfoService service;

    @Test
    public void test2(){
        FindInfo findInfo = new FindInfo();
        findInfo.setFindBrandName("aa2");
        findInfo.setFindConuntryName("bb2");
        findInfo.setFindPhone("123456");
        int save = service.save(findInfo);

        System.out.println(save);
    }


    @Test
    public void test(){
        FindInfo findInfo = new FindInfo();
        findInfo.setFindCreateDate(new Date());
        findInfo.setFindBrandName("aa");
        LayuiPage page = new LayuiPage();

        PagingResult<FindInfo> result = service.findByItem(findInfo, page);
        for(FindInfo item: result.getList()){
            System.out.println(item);
        }
    }
}
