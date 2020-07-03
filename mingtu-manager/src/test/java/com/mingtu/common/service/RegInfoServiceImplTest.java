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
public class RegInfoServiceImplTest {

    @Autowired
    private RegInfoService regInfoService;

    @Test
    public void test(){
        RegInfo regInfo = regInfoService.getById(1L);
        System.out.println(regInfo);
    }
}
