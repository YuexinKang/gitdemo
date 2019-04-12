package com.soft1841.demo4;

import javax.swing.*;

public class NumberThread implements Runnable{
    private JLabel numberLable;

    public void setNumberLable(JLabel numberLable) {
        this.numberLable = numberLable;
    }
    private final Object lock = new Object();
    private boolean pause =false;
    void pauseThread(){
        pause=true;
    }
    void resumeThread(){
        pause=false;
        synchronized (lock){
            lock.notify();
        }
    }
    void  onPause(){
        synchronized (lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    public void run() {
        int index=0;
        while (true){
            while (pause){
                onPause();
            }
            numberLable.setText(String.valueOf(index));
            try {
                Thread.sleep(500);
                ++index;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
