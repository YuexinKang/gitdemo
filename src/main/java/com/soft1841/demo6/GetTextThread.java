package com.soft1841.demo6;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import javax.swing.*;
import java.io.IOException;

public class GetTextThread implements Runnable {
    private JTextArea textArea;

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void run() {
//指定目标页面链接
        String url="https://www.mgtv.com/";
        //建立与目标页面的链接
        Connection connection= Jsoup.connect(url);
        //解析目标页面
        Document document= null;
        try {
            document = connection.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取页面中所有的class为content的元素，本例在页面中可以检查元素是div
        Elements elements=document.getElementsByClass("v-list-unit-txt");
        System.out.println(elements.size());
        for (Element e:elements) {
            //取出div的子集元素，div-a
            Element link=e.child(0);
            //得到a标记的文字内容
            String textString=link.text();
            System.out.println(textString);
            textArea.append(textString);
        }
    }
}
