package com.soft1841.demo7;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws IOException {
        //创建客户端对象，指定连接服务器IP和端口
       Socket socket=new Socket("39.96.182.225",8080);
       System.out.println("已和服务器建立连接，远程主机的运行地："+socket.getRemoteSocketAddress());

    }
}
