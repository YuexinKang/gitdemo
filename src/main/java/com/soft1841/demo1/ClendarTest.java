package com.soft1841.demo1;

import java.util.Calendar;
import java.util.Date;

public class ClendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //获取年份，月份，天，小时，分钟，秒钟
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day= calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute =calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        //调用Czlender提供getTime()方法用来获取date对象，将其对象转化为date对象
        Date date = new Date();
        //获取当前毫秒数
        Long time = calendar.getTimeInMillis();
        System.out.println("当前时间"+date);
        System.out.println("当前毫秒数"+time);
    }
}
