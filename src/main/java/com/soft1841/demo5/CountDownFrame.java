package com.soft1841.demo5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CountDownFrame extends JFrame {
    private JLabel countLabel ,wordLable;
    private int width;
    private int height;
    private CountDownFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("登录界面");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void init(){
        setLayout(null);
        ShadePanel2 shadePanel=new ShadePanel2();
        shadePanel.setLayout(null);
        shadePanel.setBounds(0, 0, width, height);
        ImgPanel imgPanel = new ImgPanel();
        imgPanel.setLayout(null);
        imgPanel.setImgPath("2.jpg");
        imgPanel.setBounds(700, 50, 500, 400);
        Font font = new Font("微软雅黑", Font.BOLD, 80);
        countLabel=new JLabel();
        countLabel.setFont(font);
        countLabel.setForeground(new Color(225,225,0));
        countLabel.setBounds(230,23,250,400);
        imgPanel.add(countLabel);
        Font font1 = new Font("微软雅黑", Font.BOLD, 64);
        wordLable=new JLabel();
        wordLable.setFont(font1);
        wordLable.setForeground(new Color(225,225,0));
        wordLable.setBounds(180,18,250,80);
        imgPanel.add(wordLable);
        shadePanel.add(imgPanel);
        add(shadePanel);
        CountDownThread cdt=new CountDownThread();
        cdt.setCountLabel(countLabel);
        cdt.setWordLabel(wordLable);
        Thread thread=new Thread(cdt);
        thread.start();
    }

    public static void main(String[] args) {
        new CountDownFrame();
    }
    class ImgPanel extends JPanel {
        private String imgPath;

        public void setImgPath(String imgPath) {
            this.imgPath = imgPath;
        }

        @Override
        protected void paintComponent(Graphics g) {
            String basePath = System.getProperty("user.dir");
            Image bg = null;
            try {
                bg = ImageIO.read(new File(basePath + "/src/image/" + imgPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
