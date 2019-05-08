package com.soft1841.demoseven;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端向客户端发送消息-控制台
 * server端使用打印流向客户端输出文本内容
 */

public class Server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket=serverSocket.accept();
            ServerThread3 serverThread3=new ServerThread3(socket);
            new Thread(serverThread3).start();
        }
    }
}
