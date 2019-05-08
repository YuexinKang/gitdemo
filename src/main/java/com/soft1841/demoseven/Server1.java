package com.soft1841.demoseven;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程服务端
 */

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        System.out.println("服务器启动成功");
        while (true){
            Socket socket=ss.accept();
           ServerThread serverThread=new ServerThread(socket);
           new Thread(serverThread).start();


        }
    }
}
    class ServerThread implements Runnable{
        private Socket socket;

        public ServerThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            System.out.println(socket.getInetAddress()+"客户端连接成功");
        }
    }



