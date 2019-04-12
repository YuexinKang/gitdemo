package com.soft1841.demo4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColourThread extends Thread{
    private JPanel colourPanel;
    public void setColourPanel(JPanel colourPanel){
        this.colourPanel=colourPanel;
    }

    @Override
    public void run() {
      while (true){
          Random random=new Random();
          int r=random.nextInt(256);
          int g=random.nextInt(256);
          int b=random.nextInt(256);
          colourPanel.setBackground(new Color(r,g,b));
          try {
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }

    public static void main(String[] args) {
        ColourThread c=new ColourThread();
        c.start();
    }
}
