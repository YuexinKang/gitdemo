package com.soft1841.demo1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 格式化当前日期时间
 * 3.14
 */


public class DeteFormatTest {
    public static void main(String[] args) {
        //创建日期
        Date date = new Date();
        //创建不同日期形式
        DateFormat dateFormat1= DateFormat.getDateInstance();
        DateFormat dateFormat2= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
        DateFormat dateFormat3 =new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 EE", Locale.CHINA);
        DateFormat dateFormat4 =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE",Locale.US);
        DateFormat dateFormat5 =new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat6 =new SimpleDateFormat("yyyy年MM月dd日");
        //将日期按不同形式输出
        System.out.println("--------将日期按不同的格式进行输出---------");
        System.out.println("按照Java的默认形式输出"+dateFormat1.format(date));
        System.out.println("按照Java的默认形式输出"+dateFormat1.format(date));
        System.out.println("按照指定形式yyyy-MM-dd hh:mm:ss EE输出，系统默认区域"+dateFormat2.format(date));
        System.out.println("按照指定形式yyyy年MM月dd日 hh时mm分ss秒 EE 区域为中国"+dateFormat3.format(date));
        System.out.println("按照指定形式yyyy-MM-dd hh:mm:ss EE输出区域为美国"+dateFormat4.format(date));
        System.out.println("按照指定形式yyyy-MM-dd输出"+dateFormat5.format(date));
        System.out.println("按照指定形式yyyy年MM月dd日输出"+dateFormat6.format(date));

    }

}
