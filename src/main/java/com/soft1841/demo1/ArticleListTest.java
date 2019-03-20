package com.soft1841.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleListTest {
    public static void main(String[] args) throws ParseException{
        List<Article> articleList = new ArrayList<>();
        //时间格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        articleList.add(new Article(1,"当时的你是最好的你，后来的我是最好的我，最好的我们之间隔了一整个青春","八月长安",simpleDateFormat.parse("2019-03-11 09:45:13")));
        articleList.add(new Article(2, "如果有一个人曾经出现过，其他的人都会变成将就，而我不愿将就", "顾漫", simpleDateFormat.parse("2019-03-15 11:15:26")));
        articleList.add(new Article(2, "再见是别离的笙箫，沉默是今晚的康桥", "徐志摩", simpleDateFormat.parse("2019-3-18 21:18:07")));
        System.out.println("id    标题                       作者       时间");
        Iterator<Article> iterator = articleList.iterator();
        while (iterator.hasNext()){
            Article article = iterator.next();
            String result = timeCal(simpleDateFormat.format(article.getWriteTime()));
            System.out.println(article.getId() + "     " + article.getTitle().substring(0, 10) + "...   " +
                    article.getAuthor() + "    " + result);
        }
    }

    private static String timeCal(String time) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long diff = 0L;

            try {
                Date d1 = format.parse(time);
                Date now = new Date();
                diff = now.getTime() - d1.getTime();
            } catch (ParseException var13) {
                var13.printStackTrace();
            }

            long seconds = diff / 1000L;
            long minutes = seconds / 60L;
            long hours = minutes / 60L;
            long days = hours / 24L;
            if (seconds < 60L) {
                return "刚刚";
            } else if (minutes < 60L) {
                return minutes + "分钟前";
            } else {
                return hours < 24L ? hours + "小时前" : days + "天前";
            }
        }
}
