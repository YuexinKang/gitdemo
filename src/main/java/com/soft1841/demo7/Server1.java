package com.soft1841.demo7;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务端向客户端发送文本信息
 */

public class Server1 {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器已启动");
        System.out.println("请输入要发布的公告");
        OutputStream out;
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        while (true){
            Socket socket=ss.accept();
            System.out.println(socket.getInetAddress()+"上线了");
            out=socket.getOutputStream();
            out.write(s.getBytes());
           out.close();
           socket.close();
        }
    }
}
