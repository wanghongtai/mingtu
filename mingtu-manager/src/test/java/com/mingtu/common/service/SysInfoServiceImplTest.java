package com.mingtu.common.service;

import com.mingtu.common.entity.RegInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Hunter on 2020-07-03.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysInfoServiceImplTest {

    @Autowired
    private SysInfoService sysInfoService;

    @Test
    public void test(){
        int count = sysInfoService.todayAccessCount();
        System.out.println(count);
    }
}
