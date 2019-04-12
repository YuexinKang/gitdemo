package com.soft1841.demo4;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimesThread extends Thread {
    private JLabel timeLabel;
    public void setTimeLabel(JLabel timeLabel){
        this.timeLabel =timeLabel;
    }

    @Override
    public void run() {
        while (true){
            String time = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
            System.out.println(time);
            timeLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) {
        TimesThread b=new TimesThread();
        b.start();
    }
}
