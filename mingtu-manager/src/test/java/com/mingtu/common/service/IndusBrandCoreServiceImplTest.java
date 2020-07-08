package com.mingtu.common.service;

import com.mingtu.common.entity.IndusBrandCore;
import com.mingtu.common.entity.IndusInfo;
import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Created by Hunter on 2020-07-08.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndusBrandCoreServiceImplTest {

    @Autowired
    private IndusBrandCoreService indusBrandCoreService;

    Map<Integer, Integer[]> coreMap = new HashMap<>();
    //Map<Integer, List<Integer>> relateMap = new HashMap<>();

    public void init(){
        coreMap.put(2, new Integer[]{16, 35, 41});
        coreMap.put(3, new Integer[]{9, 35, 40});
        coreMap.put(4, new Integer[]{21, 35, 40,43});
        coreMap.put(5, new Integer[]{2, 6, 17,19,20,21,24,27,35});
        coreMap.put(6, new Integer[]{24, 35, 40});
        coreMap.put(7, new Integer[]{18, 35, 40});
        coreMap.put(8, new Integer[]{35, 39, 41,43});
        coreMap.put(9, new Integer[]{3, 35, 40,42});
        coreMap.put(10, new Integer[]{7, 12, 35,37,40});
        coreMap.put(11, new Integer[]{11, 35, 40});
        coreMap.put(12, new Integer[]{16, 25, 35});
        coreMap.put(13, new Integer[]{9, 35, 38,42});
        coreMap.put(14, new Integer[]{9, 35, 38,42});
        coreMap.put(15, new Integer[]{5, 35, 40,44});
    }


    @Test
    public void test3(){
        //init();
        int count = 0;
        Set<Integer> keySet = coreMap.keySet();
        for (Integer infoId: keySet) {
            Integer[] largeIds = coreMap.get(infoId);
            for (Integer largeId:largeIds) {
                indusBrandCoreService.save(createIndusBrandCore(infoId, largeId));
                count++;
            }
        }
        System.out.println("添加个数："+count);
    }

    @Test
    public void test2(){
        List<IndusBrandCore> list = new ArrayList<>();
        list.add(createIndusBrandCore(1, 5));
        list.add(createIndusBrandCore(1, 29));
        list.add(createIndusBrandCore(1, 30));
        list.add(createIndusBrandCore(1, 31));
        list.add(createIndusBrandCore(1, 32));
        list.add(createIndusBrandCore(1, 33));
        list.add(createIndusBrandCore(1, 35));
        list.add(createIndusBrandCore(1, 40));
        list.add(createIndusBrandCore(1, 44));
        for (IndusBrandCore core:list) {
            System.out.println(indusBrandCoreService.save(core));
        }
    }

    private IndusBrandCore createIndusBrandCore(long indusInfoId, long largeTyleId) {
        IndusBrandCore core = new IndusBrandCore();
        core.setIndusInfoId(indusInfoId);
        core.setBrandLargeTypeId(largeTyleId);
        core.setCreateDate(new Date());
        return core;
    }


}
