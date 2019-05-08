package com.soft1841.demo7;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("10.30.178.53",10086);
        OutputStream out=socket.getOutputStream();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要发给服务器的内容：");
        String s=scanner.nextLine();
        out.write(s.getBytes());
        out.close();
        socket.close();
    }
}
