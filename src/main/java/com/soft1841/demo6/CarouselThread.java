package com.soft1841.demo6;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CarouselThread implements Runnable {
    private JLabel imgLabel;
    private String[]  imgs={"D:/program/1.png","D:/program/2.png","D:/program/3.png","D:/program/4.png","D:/program/5.png","D:/program/6.png","D:/program/7.png","D:/program/8.png","D:/program/9.png","D:/program/10.png"
           };

    public void setImgLabel(JLabel imgLabel) {
        this.imgLabel = imgLabel;
    }

    @Override
    public void run() {
        int i =0;
        int len =imgs.length-1;
        while (true){
            try {
                File file=new File(imgs[i]);
                InputStream inputStream=new FileInputStream(file);
                byte[] bytes=new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon=new ImageIcon(bytes);
                imgLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i==len+1){
                    i=0;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
