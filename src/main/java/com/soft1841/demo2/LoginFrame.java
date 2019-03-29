package com.soft1841.demo2;


import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    private JLabel acccountLabel,passwordLabel,roleLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JComboBox<String> roleComboBox;
    private JButton comfirButton,cancelButton;

    public LoginFrame(){
        init();
        setTitle("登录窗体");
        setSize(640,480);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    private  void init(){
        Font font = new Font("微软雅黑",Font.PLAIN,18);
        acccountLabel = new JLabel("账号");
        acccountLabel.setFont(font);
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel=new JLabel("密码");
        passwordLabel.setFont(font);
        passwordField= new JPasswordField();
        passwordField.setFont(font);
        roleLabel=new JLabel("角色");
        roleLabel.setFont(font);
        String[] roles ={"教师","学生"};
        roleComboBox = new JComboBox<>(roles);
        roleComboBox.setFont(font);
        comfirButton =new JButton("确认");
        comfirButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        setLayout(null);
        acccountLabel.setBounds(140,60,100,35);
        accountField.setBounds(240,60,260,35);
        passwordLabel.setBounds(140,130,100,35);
        passwordField.setBounds(240,130,260,35);
        roleLabel.setBounds(140,200,100,35);
        roleComboBox.setBounds(240,200,260,35);
        comfirButton.setBounds(160,300,100,40);
        cancelButton.setBounds(380,300,100,40);
        comfirButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
        cancelButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
        add(acccountLabel);
        add(accountField);
        add(passwordLabel);
        add(passwordField);
        add(roleLabel);
        add(roleComboBox);
        add(comfirButton);
        add(cancelButton);



    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new LoginFrame();

    }
}
