package com.soft1841.demo1;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
public class DateDifferentExample {
    public static void main(String[] args) {
        //分别定义起止时间
        String startTime = "2019-03-16 20:31:58";
        String stopTime = "2019-03-17 22:43:48";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        Date d2;
        long diff = 0;
        //通过SimpleDateFormat的对象来把String类型的时间对象转化成Date类型的对象
        try {
            d1 = format.parse(startTime); d2 = format.parse(stopTime);
            //毫秒ms的差值
            diff = d2.getTime() - d1.getTime();
        } catch (ParseException e) { e.printStackTrace();
        }
        //将毫秒分别换算成秒、分、小时、天
        long diffSeconds = diff / 1000;
        long diffMinutes = diff / (1000 * 60);
        long diffHours = diff / (1000 * 60 * 60);
        long diffDays = diff / (1000 * 60 * 60 * 24);

        System.out.println("两个时间相差：" + Math.abs(diffSeconds) + "秒");
        System.out.println("两个时间相差：" + Math.abs(diffMinutes) + "分");
        System.out.println("两个时间相差：" + Math.abs(diffHours) + "小时");
        System.out.println("两个时间相差：" + Math.abs(diffDays) + "天");
        if (diffSeconds<=0){
            System.out.println("刚刚");
        }
        if (diffSeconds>0 && diffMinutes<0){
            System.out.println(diffSeconds+"秒钟前");
        }
        if (diffMinutes>0 && diffHours<0){
            System.out.println(diffMinutes+"分钟前");
        }
        if (diffHours>0 && diffDays<0){
            System.out.println(diffHours+"小时前");
        }
        if (diffDays>0){
            System.out.println(diffDays+"天前");
        }
    }

}
