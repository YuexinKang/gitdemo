package com.soft1841.demo3;



import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class HomeWorkFrame extends JFrame implements ActionListener {

    private JButton seticonButton,settxtButton,copyButton;
    private JPanel  topPanel,rightPanel,leftPanel;
    private JFileChooser fileChooser;
    private CardLayout cardLayout;
    private JLabel imgLabel,txtLabel;
    private Icon icon;

    public HomeWorkFrame(){
        init();
        setTitle("作业窗口");
        setSize(900,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public  void  init(){
        topPanel=new JPanel();
        copyButton=new JButton("备份");
        copyButton.addActionListener(this);
        topPanel.add(copyButton);
        seticonButton=new JButton("图片");
        seticonButton.addActionListener(this);
        settxtButton=new JButton("文本");
        settxtButton.addActionListener(this);
        leftPanel=new JPanel();
        leftPanel.add(seticonButton);
        leftPanel.add(settxtButton);
        rightPanel=new JPanel();
        //创建卡片布局对象
        cardLayout= new CardLayout();
        rightPanel.setLayout(cardLayout);
        add(topPanel,BorderLayout.NORTH);
        add(leftPanel,BorderLayout.WEST);
        add(rightPanel,BorderLayout.EAST);

    }

    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e1){
            e1.printStackTrace();
        }
        new HomeWorkFrame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==copyButton){
            //创建选择器对象
            fileChooser=new JFileChooser();
            //设置文件选择器默认路径
            fileChooser.setCurrentDirectory(new File("D:/"));
            //打开对话框
            int reault=fileChooser.showOpenDialog(null);
            //在控制台输出，看看用户点击按钮时控制台的result值输出情况，判断用户点击的是哪个按钮，
            // 用条件语句，点击确认执行点击取消则什么都不做
            System.out.println(reault);
            //设置用户是否选择了确认按钮
            if (reault==JFileChooser.APPROVE_OPTION) {
                //获取用户选择文件
                File srcFile = fileChooser.getSelectedFile();
                String name = srcFile.getName();
                int position = name.indexOf(".");
                String suffixName = name.substring(position + 1);
                File destFile = new File("D:/" + name + "副本" + "." + suffixName);
                //创建一个字节数组，大小为源文件大小
                byte[] bytes = new byte[(int) srcFile.length()];
                //创建字节输入流
                InputStream in = null;
                try {
                    in = new FileInputStream(srcFile);
                    //将源文件读入字节数组
                    in.read(bytes);
                    //创建字节输出流
                    OutputStream out = new FileOutputStream(destFile);
                    //将字节数组通过字节输出流写入目标文件
                    out.write(bytes);
                    //关闭输入输出流
                    in.close();
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                if (destFile.exists()){
                    JOptionPane.showMessageDialog(null,"操作成功");
                }else {
                    JOptionPane.showMessageDialog(null,"操作失败");
                }
            }
        }
        if (e.getSource()==seticonButton){
            //创建选择器对象
            fileChooser=new JFileChooser();
            //设置文件选择器默认路径
            fileChooser.setCurrentDirectory(new File("D:/"));
            //打开对话框
            int reault1=fileChooser.showOpenDialog(null);
            //在控制台输出，看看用户点击按钮时控制台的result值输出情况，判断用户点击的是哪个按钮，
            // 用条件语句，点击确认执行点击取消则什么都不做
            System.out.println(reault1);
            //设置用户是否选择了确认按钮
            if (reault1==JFileChooser.APPROVE_OPTION) {
                File srcFile = fileChooser.getSelectedFile();
                String name = srcFile.getName();
                int position = name.indexOf(".");
                String suffixName = name.substring(position + 1);
                System.out.println(suffixName);
                if (suffixName.equals("jpg")||suffixName.equals("png")){
                    byte[] bytes = new byte[(int) srcFile.length()];
                    InputStream in = null;
                    try {
                        in = new FileInputStream(srcFile);
                        in.read(bytes);
                        imgLabel=new JLabel();
                        icon = new ImageIcon(bytes);
                        imgLabel.setIcon(icon);
                        rightPanel.add(imgLabel);
                        in.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"请选择图片");
                }

            }

        }
        if (e.getSource()==settxtButton){
            //创建选择器对象
            fileChooser=new JFileChooser();
            //设置文件选择器默认路径
            fileChooser.setCurrentDirectory(new File("D:/"));
            //打开对话框
            int reault2=fileChooser.showOpenDialog(null);
            //在控制台输出，看看用户点击按钮时控制台的result值输出情况，判断用户点击的是哪个按钮，
            // 用条件语句，点击确认执行点击取消则什么都不做
            System.out.println(reault2);
            //设置用户是否选择了确认按钮
            if (reault2==JFileChooser.APPROVE_OPTION) {
                File srcFile = fileChooser.getSelectedFile();
                String name = srcFile.getName();
                int position = name.indexOf(".");
                String suffixName = name.substring(position + 1);
                System.out.println(suffixName);
                if (suffixName.equals("txt")) {
                    byte[] bytes = new byte[(int) srcFile.length()];
                    InputStream in = null;
                    try {
                        in = new FileInputStream(srcFile);
                        in.read(bytes);
                        String s=new String(bytes);
                        System.out.println(s);
                        txtLabel = new JLabel(s);
                        rightPanel.add(txtLabel);
                        in.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "请选择文本");
                }
            }
        }
    }
}
