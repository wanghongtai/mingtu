package com.mingtu.common.lang;

import org.junit.Test;

import java.util.Date;

/**
 * Created by Hunter on 2020-07-03.
 */
public class DatesTest {


    @Test
    public void test(){
        Date dayBegin = Dates.getDayBegin();
        System.out.println(Dates.format("yyyy-MM-dd HH:mm:ss", dayBegin));
    }

    @Test
    public void test2(){
        Date dayEnd = Dates.getDayEnd();
        System.out.println(Dates.format("yyyy-MM-dd HH:mm:ss", dayEnd));
    }

}
