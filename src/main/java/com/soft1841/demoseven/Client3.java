package com.soft1841.demoseven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *服务器向客户端发送信息-控制台
 * client端通过bufferedReader读取内容
 */

public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("127.0.0.1",10086);
        System.out.println("成功连上服务器");
        BufferedReader buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str=buf.readLine();
        System.out.println("服务器端输出内容"+str);
        buf.close();
        client.close();

    }
}
