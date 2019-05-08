package com.soft1841.demo6;


import javax.swing.*;
import java.awt.*;


public class HomeworkFrame extends JFrame {
    private JPanel contentPane;
    private JPanel imgPanel ;
    private JLabel imgLabel ,timeLabel ;
    private JPanel leftPanel,rightPanel;
    private JTextArea textArea;

    private HomeworkFrame(){
        init();
        setTitle("芒果TV-遇见好时光");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init(){
        //创建一个容器，将其设置为空布局
        Container c=getContentPane();
        this.setLayout(null);
        //创建一个面板，将其设置为边界布局
        contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout(0,0));
        //创建一个图片面板，一个图片标签，用来图片轮播
        imgPanel=new JPanel();
        imgLabel=new JLabel();
        //运用ShadePanel类创建一个有渐变效果底部面板，一个时间标签，用来倒计时
        ShadePanel2 bottomPanel=new ShadePanel2();
        bottomPanel.setPreferredSize(new Dimension(1000,100));
        //创建一个左面板，一个文本域，用来爬取数据
        leftPanel=new JPanel();
        leftPanel.setPreferredSize(new Dimension(800,400));
        //创建一个有面板， 设置为网格布局，用来展示图片
        rightPanel=new JPanel();
        rightPanel.setLayout(new GridLayout(1,4,15,0));
        textArea=new JTextArea();
        Font font=new Font("微软雅黑",Font.BOLD,32);
        textArea.setFont(font);
        textArea.setPreferredSize(new Dimension(800,400));
        textArea.setLineWrap(true);        //激活自动换行功能
        textArea.setEditable(false);//只可读不可编辑
        timeLabel=new JLabel();
        timeLabel.setFont(font);
        timeLabel.setForeground(new Color(225,120,4));
        //创建了一个滚动面板，将组件加在top,left,right,bottom,面板中，
        // 将top,left,right,bottom,面板加在content面板中，
        //最后将content面板整个加入滚动面板中
        imgPanel.add(imgLabel);
        leftPanel.add(textArea);
        bottomPanel.add(timeLabel);
        contentPane.add(rightPanel,BorderLayout.EAST);
        contentPane.add(leftPanel,BorderLayout.WEST);
        contentPane.add(imgPanel,BorderLayout.NORTH);
        contentPane.add(bottomPanel,BorderLayout.SOUTH);
        JScrollPane scrollPane=new JScrollPane(contentPane,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(10,10,2000,1000);
        c.add(scrollPane);
        //创建线程实现图片轮播，爬取数据，展示图片
       CarouselThread ct=new CarouselThread();
       ct.setImgLabel(imgLabel);
       new Thread(ct).start();
       GetTextThread gtt =new GetTextThread();
       gtt.setTextArea(textArea);
       new Thread(gtt).start();
       GetTimeThread gtt1 =new GetTimeThread();
       gtt1.setTimeLabel(timeLabel);
       new Thread(gtt1).start();
       GetImagesThread git=new GetImagesThread();
       git.setRightPanel(rightPanel);
       new Thread(git).start();

    }

    public static void main(String[] args) {
        new HomeworkFrame();
    }

}
