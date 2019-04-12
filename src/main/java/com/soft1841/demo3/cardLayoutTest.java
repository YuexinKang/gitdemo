package com.soft1841.demo3;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class cardLayoutTest extends JFrame implements ActionListener {
    private  JPanel cardPanel;
    private JButton  preButton,nextButton;
    private JPanel buttonPanel;
    private CardLayout cardLayout;
    public cardLayoutTest(){
        init();
        setTitle("卡片布局");
        setSize(900,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public  void init(){
        //创建卡片布局对象
        cardLayout= new CardLayout();
        //创建一个容器，设置卡片布局
        cardPanel=new JPanel(cardLayout);
        cardPanel.setLayout(cardLayout);
        //循环调用三次，每次向容器中加入一个getpanel()方法得到的面板对象，并且编号为1，2，3
        for(int i = 0;i<3;i++){
            cardPanel.add(String.valueOf(i+1),getpanel());
            //容器加入窗体中间
            add(cardPanel);
            //底部按钮面板，放入两个按钮，面板加入窗体底部
            buttonPanel=new JPanel();
            buttonPanel.setBackground(new Color(120,165,241));
            preButton=new JButton("上一张");
            nextButton=new JButton("下一张");
            buttonPanel.add(preButton);
            buttonPanel.add(nextButton);
            add(buttonPanel,BorderLayout.SOUTH);
            //按钮注册监听
            preButton.addActionListener(this);
            nextButton.addActionListener(this);
        }
    }
//内部方法，返回一个随机背景色的JPanel对象
    private JPanel getpanel() {
        JPanel newPanel=new JPanel();
        Random random=new Random();
        int r = random.nextInt(256);
        int g= random.nextInt(256);
        int b= random.nextInt(256);
        newPanel.setBackground(new Color(r,g,b));
        return newPanel;

    }

    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e1){
            e1.printStackTrace();
        }
        new cardLayoutTest();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==preButton){
            cardLayout.previous(cardPanel);
        }
        if (e.getSource()==nextButton){
            cardLayout.next(cardPanel);
        }
    }
}
