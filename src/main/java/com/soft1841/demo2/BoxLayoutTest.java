package com.soft1841.demo2;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest extends JFrame {
    public BoxLayoutTest(){
        init();
        setTitle("盒子布局");
        setSize(410,730);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }



    public  void init(){
        setLayout(new BorderLayout(20,20));
        JPanel topPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(topPanel,BoxLayout.X_AXIS);
        topPanel.setLayout(boxLayout);
        topPanel.setBackground(new Color(16,97,15));
        topPanel.setPreferredSize(new Dimension(414,100));
        JButton leftButton = new JButton("扫一扫");
        leftButton.setPreferredSize(new Dimension(80,30));
        topPanel.add(leftButton);
        topPanel.add(Box.createHorizontalGlue());
        JButton rightButton = new JButton("扫一扫");
        rightButton.setPreferredSize(new Dimension(80,30));
        topPanel.add(rightButton);
        add(topPanel,BorderLayout.NORTH);
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel,BoxLayout.Y_AXIS));
        for (int i = 0; i < 3; i++){
            JPanel jPanel = new JPanel();
            jPanel.setPreferredSize(new Dimension(410,120));
            jPanel.setBackground(new Color(246,162,179));
            middlePanel.add(jPanel);
            middlePanel.add(Box.createVerticalStrut(20));
        }
        add(middlePanel,BorderLayout.CENTER);


        
    }

    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            BeautyEyeLNFHelper.launchBeautyEyeLNF();

        }catch (Exception e){
            e.printStackTrace();
        }
        new BoxLayoutTest();
    }

}
