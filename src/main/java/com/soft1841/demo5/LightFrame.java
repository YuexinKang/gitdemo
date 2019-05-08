package com.soft1841.demo5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class LightFrame extends JFrame {
   private JPanel contentPanel;
   private  JPanel bgPanel;
   private JLabel bgLabel;
   public LightFrame(){
       init();
       setTitle("模拟交通灯变化场景");
       setSize(100,320);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }
   public void init(){
       contentPanel=new JPanel();
       contentPanel.setBackground(Color.BLACK);
       contentPanel.setBorder(new EmptyBorder(5,5,5,5));
       contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
       setContentPane(contentPanel);
       bgLabel=new JLabel();
       bgPanel=new JPanel();
       bgPanel.setBackground(Color.BLUE);
       bgPanel.setBorder(new TitledBorder(null,"交通灯",TitledBorder.LEADING,TitledBorder.TOP,null,null));
       contentPanel.add(bgPanel);
       bgLabel=new JLabel();
       bgLabel.setBackground(Color.GREEN);
       bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/image/yello.jpg")));
       bgPanel.add(bgLabel,BorderLayout.CENTER);
       LightThread lt =new LightThread();
       lt.setBgLabel(bgLabel);
       lt.start();
   }

    public static void main(String[] args) {
        new LightFrame();
    }

}
