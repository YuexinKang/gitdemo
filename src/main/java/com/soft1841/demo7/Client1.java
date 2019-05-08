package com.soft1841.demo7;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("10.40.203.82",12580);
        //获取客户端的输入流
        InputStream in=socket.getInputStream();
        byte[] b=new byte[1024];
        in.read(b);
        System.out.println("已和服务器建立连接，远程主机的运行地址："+socket.getRemoteSocketAddress());
        System.out.println("服务器发送的公告是"+new String(b));
        in.close();
        socket.close();
    }
}
