package com.soft1841.demo4;



import javax.swing.*;
import java.awt.*;

public class DrawImgTest extends JFrame {
    public DrawImgTest(){
        //设置窗体大小
    this.setSize(500,300);
    //设置窗体关闭模式
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //设置窗体面板为绘图面板对象
    add(new CanvasTest());
    //设置窗体标题
    this.setTitle("绘制图像");
    }

    public static void main(String[] args) {
        //设置窗体可见
    new DrawImgTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        //创建画布
        public void paint(Graphics g){
            super.paint(g);
            //创建绘图对象
            Graphics2D g2 =(Graphics2D) g;
            //获取图片资源
            Image image=new ImageIcon("src/image/image.jpg").getImage();
            //显示图像
            g2.drawImage(image,0,0,this);

        }
    }
}
