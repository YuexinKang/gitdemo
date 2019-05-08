package com.soft1841.demo7;



import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args)throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket=ss.accept();
            System.out.println(socket.getInetAddress()+"上线了");
            InputStream in=socket.getInputStream();
            byte[] b=new byte[1024];
            in.read(b);
            System.out.println("客户端发送的消息为"+new String(b));
        }
    }
}
