package com.mingtu.common.lang;

import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Hunter on 2020-06-23.
 */
public class Dates {

    private static SimpleDateFormat sdf = new SimpleDateFormat();
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public static String format(String pattern, Date date) {
        sdf.applyPattern(pattern);
        return sdf.format(date);
    }

    public static Date parseYMD(String date) throws ParseException {
        return sdf2.parse(date);
    }
    public static Date parseYMDHms(String date) throws ParseException {
        return sdf3.parse(date);
    }

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        String format = Dates.format("yyyy-MM-dd HH:mm:ss", date);
//        System.out.println(format);
        System.out.println(Dates.format("yyyy-MM-dd HH:mm:ss",getDayBegin(new Date())));
        System.out.println(Dates.format("yyyy-MM-dd HH:mm:ss",getDayEnd(new Date())));
    }



    //获取给定日期的开始时间
    public static Date getDayBegin(Date date) throws ParseException {
        String dateStr = Dates.format("yyyy-MM-dd", date);
        return parseYMD(dateStr);
    }
    public static Date getDayEnd(Date date) throws ParseException {
        String dateStr = Dates.format("yyyy-MM-dd", date);
        dateStr += " 23:59:59";
        return parseYMDHms(dateStr);
    }

    //获取当天的开始时间
    public static Date getDayBegin() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
    //获取当天的结束时间
    public static Date getDayEnd() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }


    //获取昨天的开始时间
    public static Date getBeginDayOfYesterday() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    //获取昨天的结束时间
    public static Date getEndDayOfYesterDay() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }
}
