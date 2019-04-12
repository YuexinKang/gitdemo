package com.soft1841.demo4;

import javax.swing.*;
import java.awt.*;

public class DrawLineFrame extends JFrame {
    private DrawLineFrame(){
        init();
        setTitle("绘制彩色线段");
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        getContentPane().setBackground(new Color(110,110,110));
        DrawLineThead drawLineThead=new DrawLineThead();
        drawLineThead.setFrame(this);
        new Thread(drawLineThead).start();

    }

    public static void main(String[] args) {
        new DrawLineFrame();
    }
}
