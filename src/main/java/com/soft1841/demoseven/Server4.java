package com.soft1841.demoseven;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {
    public static void main(String[] args)throws IOException {
        ServerSocket serverSocket=new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket=serverSocket.accept();
            ServerThread4 server=new ServerThread4(socket);
            new Thread(server).start();
        }

    }
}
