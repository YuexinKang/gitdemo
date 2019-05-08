package com.soft1841.demo5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockFrame extends JFrame {
    private JLabel timeLabel;
    private TimerTask timerTask,clockTask;
    private Timer timer;
    private ClockFrame(){
        init();
        setTitle("闹钟的小练习");
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        JPanel bgPanel= new JPanel(){
            protected void paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("D:/Clock.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        bgPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(bgPanel);
        timeLabel=new JLabel();
        Font font = new Font("微软雅黑", Font.BOLD, 32);
        timeLabel.setFont(font);
        bgPanel.add(timeLabel);
        timerTask=new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                timeLabel.setText(timeString);
            }
        };
        clockTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                if(timeString.equals("2019-04-16 08:49:59")){
                    JOptionPane.showMessageDialog(bgPanel, "时间到~~");
                    timerTask.cancel();
                    this.cancel();
                }
            }
        };
        timer = new Timer();
        timer.schedule(timerTask,0,1000);
        timer.scheduleAtFixedRate(clockTask, 0, 1000);

    }

    public static void main(String[] args) {
        new ClockFrame();
    }
}
