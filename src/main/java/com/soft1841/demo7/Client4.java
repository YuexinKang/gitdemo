package com.soft1841.demo7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端向服务器端发送文本数据-控制台版本
 * Client客户端
 */

public class Client4 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("localhost",12000);
        System.out.println("成功连上服务器");
        Scanner scanner=new Scanner(System.in);
        BufferedWriter buf;
        System.out.println("请输入一行信息");
        String str=scanner.nextLine();
        buf=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        buf.write(str);
        buf.flush();
        buf.close();

    }
}
