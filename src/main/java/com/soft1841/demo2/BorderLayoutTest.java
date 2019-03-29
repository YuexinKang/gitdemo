package com.soft1841.demo2;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest(){
        setTitle("这个窗体使用边界布局管理器");
        Container container =getContentPane();
        setLayout(new BorderLayout());
        JButton centerBtn = new JButton("中神通");
        JButton notthBtn = new JButton("北乞");
        JButton southrBtn = new JButton("南帝");
        JButton westBtn = new JButton("西毒");
        JButton eastBtn = new JButton("东邪");
        container.add(centerBtn,BorderLayout.CENTER);
        container.add(notthBtn,BorderLayout.NORTH);
        container.add(southrBtn,BorderLayout.SOUTH);
        container.add(westBtn,BorderLayout.WEST);
        container.add(eastBtn,BorderLayout.EAST);
        setSize(350,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
