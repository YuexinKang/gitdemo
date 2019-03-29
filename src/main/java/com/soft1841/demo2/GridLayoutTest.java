package com.soft1841.demo2;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame {
    private JPanel[] panels;
    private GridLayoutTest(){
        init();
        setTitle("网格布局管理器");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void  init(){
        getContentPane().setBackground(new Color(225,225,225));
      GridLayout gridLayout  = new GridLayout(3,3,50,30);
      setLayout(gridLayout);
      panels = new JPanel[9];
      for (int i = 0;i<9;i++){
          panels[i]= new JPanel();
          panels[i].setBorder(BorderFactory.createTitledBorder("面板"+(i+1)));
          add(panels[i]);
          panels[0].setBackground(new Color(178,223,219));

      }
        for (int i =0;i<5;i++){
            panels[0].add(new JButton("JAVA"));
        }
        panels[1].setLayout(new BorderLayout(20,20));
        panels[1].setBackground(new Color(178,223,219));
        panels[1].add(new JButton("北"),BorderLayout.NORTH);
        panels[1].add(new JButton("南"),BorderLayout.SOUTH);
        panels[1].add(new JButton("东"), BorderLayout.EAST);
        panels[1].add(new JButton("西"), BorderLayout.WEST);
        panels[1].add(new JButton("中"), BorderLayout.CENTER);
        panels[2].setLayout(new GridLayout(3, 3, 10, 10));
        panels[2].setBackground(new Color(77, 182, 172));
        for (int i = 0; i < 9; i++) {
            panels[2].add(new JButton(String.valueOf(i + 1)));
            }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
        new GridLayoutTest();
    }
}
