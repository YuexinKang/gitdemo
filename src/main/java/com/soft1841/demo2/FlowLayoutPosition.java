package com.soft1841.demo2;
/**
 * 使用FloeLayout流布局
 */

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        //设置窗体标题
        setTitle("本窗体使用流布局管理器");
        //设置窗体使用流布局管理器，使组件右对齐，组件之间的水平间隔为10像素，垂直间隔10像素
        Container container =getContentPane();
        //在容器中循环添加10个按钮
        setLayout( new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i =0;i<10;i++){
            container.add( new JButton("button"+i));
            //设置窗体大小
            setSize(300,200);
            //设置窗体关闭方式
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            //设置窗体可见
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
