package com.soft1841.demo6;

import javax.swing.*;

public class GetTimeThread implements Runnable {
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        for (int i = 60;i>0;i--){
            timeLabel.setText("距离2019元宵喜乐和汇开播时间还有2小时"+String.valueOf(i)+"分");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
