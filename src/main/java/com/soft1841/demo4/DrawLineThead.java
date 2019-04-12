package com.soft1841.demo4;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawLineThead implements Runnable {
    int x=200;
    int y=100;
    private JFrame frame;
    private Color[] colours={Color.WHITE,Color.BLACK,Color.YELLOW,Color.PINK,Color.ORANGE,Color.MAGENTA,Color.CYAN,Color.GREEN};

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        Random random=new Random();
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics=frame.getGraphics();
            graphics.setColor(colours[random.nextInt(colours.length)]);
            graphics.drawLine(x,y,900,y);
            y+=20;
            if (y>=500){
                y=100;
            }
        }

    }
}
