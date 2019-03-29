package com.soft1841.demo2;
/**
 *
 */

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
   public BorderLayoutPosition(){
       setTitle("这个窗体使用边界布局管理器");
       //定义一个容器
       Container container =getContentPane();
       //设置容器为边界布局管理器
       setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中");
        JButton notthBtn = new JButton("北");
        JButton southrBtn = new JButton("南");
        JButton westBtn = new JButton("西");
        JButton eastBtn = new JButton("东");
        //中部添加按钮
        container.add(centerBtn,BorderLayout.CENTER);
       //北部添加按钮
        container.add(notthBtn,BorderLayout.NORTH);
       //南部添加按钮
        container.add(southrBtn,BorderLayout.SOUTH);
       //西部添加按钮
        container.add(westBtn,BorderLayout.WEST);
       //东部添加按钮
        container.add(eastBtn,BorderLayout.EAST);
        setSize(350,200);
        setVisible(true);
   }
    public static void main(String[] args) {
    new BorderLayoutPosition();

    }

}
