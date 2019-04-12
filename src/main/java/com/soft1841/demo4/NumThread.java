package com.soft1841.demo4;

import javax.swing.*;
import java.util.Random;

public class NumThread extends Thread {
    private JLabel numberLabel;
    public void setNumberLabel(JLabel numberLabel){
        this.numberLabel=numberLabel;
    }

    @Override
    public void run() {
    Random random=new Random();
    while (true){
        int num=random.nextInt(100);
        numberLabel.setText(String.valueOf(num));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

    public static void main(String[] args) {
        NumThread a = new NumThread();
        a.start();
    }
}
