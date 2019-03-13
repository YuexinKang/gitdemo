package com.soft1841.demo1;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.util.Random;

/**
 *屏幕上两点间的距离
 *3.13
 */

public class Line {
    public static void main(String[] args) throws IOException {
        //指定图片的大小和类型
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD, 20);
        //画笔获取颜色，字体
        graphics.setColor(Color.GREEN);
        graphics.setFont(font);
        //画一个长为1024，宽为768的矩形作为画布
        graphics.fillRect(0,0,1024,768);
        //随机种子，随意生成4个随机数作为确定一条线的那两个点的横纵坐标
        Random random = new Random();
        int x1 = random.nextInt(1024);
        int x2 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int y2 = random.nextInt(768);
        //控制台输出两点的横纵坐标
        System.out.println("p1:("+x1+","+y1+")");
        System.out.println("p2:("+x2+","+y2+")");
        //调用函数算出两点间距离，保留两位小数
        double distance = Math.sqrt((x1 + x2)*(x1 +x2)+(y1+y2)*(y1+y2));
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String s =decimalFormat.format(distance);
        //控制台输出两点间距离
        System.out.println("两点间的距离为：" + s);
        //画一条黑色的线，写上两点间的距离
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x1,y1,x2,y2);
        graphics.drawString(s,(x1+x2)/2,(y1+y2/2));
        //输出图片
        File file = new File("D:/Line.jpg");
        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        ImageIO.write(bufferedImage,"jpg",outputStream);
        //关闭输出流
        outputStream.close();


    }

}
