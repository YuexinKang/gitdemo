package com.soft1841.demo4;

import javax.swing.*;
import java.awt.*;

public class NumFrame extends JFrame {
    private JLabel numberLabel;
    private JLabel timeLabel;
    private JPanel colourPanel;

    public NumFrame(){
        init();
        setTitle("随机数窗口");
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void  init(){
        numberLabel=new JLabel("随机数");
        Font font=new Font("微软雅黑",Font.BOLD,50);
        numberLabel.setFont(font);
        add(numberLabel,BorderLayout.WEST);
        NumThread numThread=new NumThread();
        numThread.setNumberLabel(numberLabel);
        numThread.start();
        timeLabel=new JLabel("时间");
        timeLabel.setFont(font);
        add(timeLabel,BorderLayout.NORTH);
        TimesThread timeThread=new TimesThread();
        timeThread.setTimeLabel(timeLabel);
        timeThread.start();
        colourPanel=new JPanel();
        add(colourPanel);
        ColourThread colourThread=new ColourThread();
        colourThread.setColourPanel(colourPanel);
        colourThread.start();


    }


    public static void main(String[] args) {
        new NumFrame();
    }
}
