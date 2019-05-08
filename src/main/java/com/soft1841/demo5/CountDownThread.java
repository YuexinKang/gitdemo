package com.soft1841.demo5;

import javax.swing.*;

public class CountDownThread implements Runnable {
    private Thread thread;

    public void setThread(Thread thread) {
        this.thread = thread;
    }
    private JLabel countLabel;

    public void setCountLabel(JLabel countLabel) {
        this.countLabel = countLabel;
    }
    private JLabel wordLabel;

    public void setWordLabel(JLabel wordLabel) {
        this.wordLabel = wordLabel;
    }

    @Override
    public void run() {
        wordLabel.setText("start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            try {
                thread.join();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        for (int i = 10;i>0;i--){
            countLabel.setText(String.valueOf(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        wordLabel.setText("end");
    }
}
