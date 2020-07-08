package com.mingtu.common.service;

import com.mingtu.common.entity.IndusInfo;
import com.mingtu.common.entity.vo.IndusInfoVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Hunter on 2020-07-08.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IndusInfoServiceImplTest {


    @Autowired
    private IndusInfoService indusInfoService;


    @Test
    public void test2() {
        IndusInfo indusInfo = indusInfoService.getById(1L);
        System.out.println(indusInfo);
    }

    @Test
    public void test3() {
        List<IndusInfoVo> list = indusInfoService.findByItemWithCoreCateList(new IndusInfoVo());
        for (IndusInfoVo info : list) {
            System.out.println(info);
        }
    }
    @Test
    public void test4() {
        List<IndusInfoVo> list = indusInfoService.findByItemWithRelateCateList(new IndusInfoVo());
        for (IndusInfoVo info : list) {
            System.out.println(info);
        }
    }

    @Test
    public void test5() {
        List<IndusInfoVo> list = indusInfoService.findByItemWithAllCateList(new IndusInfoVo());
        for (IndusInfoVo info : list) {
            System.out.println(info);
        }
    }

    @Test
    public void test() {

        List<IndusInfo> list = new ArrayList<>();
        list.add(createIndusInfo("食品行业"));
        list.add(createIndusInfo("教育行业"));
        list.add(createIndusInfo("电子产品行业"));
        list.add(createIndusInfo("餐饮行业"));
        list.add(createIndusInfo("家具、家居、建材行业"));
        list.add(createIndusInfo("纺织行业"));
        list.add(createIndusInfo("箱包行业"));
        list.add(createIndusInfo("旅游、物流行业"));
        list.add(createIndusInfo("日化、洗护行业"));
        list.add(createIndusInfo("机械、交通工具行业"));
        list.add(createIndusInfo("照明、加热、制冷、净化设备行业"));
        list.add(createIndusInfo("服装行业"));
        list.add(createIndusInfo("互联网行业"));
        list.add(createIndusInfo("电商行业"));
        list.add(createIndusInfo("医疗、医药行业"));

        for (IndusInfo indusInfo : list) {
            int count = indusInfoService.save(indusInfo);
            System.out.println(count);
        }
    }


    private IndusInfo createIndusInfo(String name) {
        IndusInfo indusInfo = new IndusInfo();
        indusInfo.setName(name);
        indusInfo.setCreateDate(new Date());
        return indusInfo;
    }
}
