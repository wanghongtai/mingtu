package com.mingtu.common.service;

import com.mingtu.common.entity.IndusBrandRelate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Hunter on 2020-07-08.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class IndusBrandRelateServiceImplTest {

    @Autowired
    private IndusBrandRelateService indusBrandRelateService;

    Map<Integer, Integer[]> relateMap = new HashMap<>();

    public void init(){
        relateMap.put(1, new Integer[]{2, 9, 16,39,43});
        relateMap.put(2, new Integer[]{9, 25, 42});
        relateMap.put(3, new Integer[]{16, 25, 37,42});
        relateMap.put(4, new Integer[]{9, 16, 21,25,29,30,31,32,33,41});
        relateMap.put(5, new Integer[]{8, 9, 16,25,37,39,40,42});
        relateMap.put(6, new Integer[]{9, 16, 23,37,42});
        relateMap.put(7, new Integer[]{16, 25, 37,42});
        relateMap.put(8, new Integer[]{9, 16, 21,28,45});
        relateMap.put(9, new Integer[]{9, 16, 21,37,44});
        relateMap.put(10, new Integer[]{9, 16,17, 39,41,42});
        relateMap.put(11, new Integer[]{9, 16,25, 37,42});
        relateMap.put(12, new Integer[]{9, 10, 26,37,45});
        relateMap.put(13, new Integer[]{16,36,39, 41,43,45});
        relateMap.put(14, new Integer[]{16, 36, 41,45});
        relateMap.put(15, new Integer[]{3, 7, 9,10,16,28,42});
    }


    @Test
    public void test3(){
        init();
        int count = 0;
        Set<Integer> keySet = relateMap.keySet();
        for (Integer infoId: keySet) {
            Integer[] largeIds = relateMap.get(infoId);
            for (Integer largeId:largeIds) {
                indusBrandRelateService.save(createIndusBrandRelate(infoId, largeId));
                count++;
            }
        }
        System.out.println("添加个数："+count);
    }

    private IndusBrandRelate createIndusBrandRelate(long indusInfoId, long largeTyleId) {
        IndusBrandRelate core = new IndusBrandRelate();
        core.setIndusInfoId(indusInfoId);
        core.setBrandLargeTypeId(largeTyleId);
        core.setCreateDate(new Date());
        return core;
    }
}
