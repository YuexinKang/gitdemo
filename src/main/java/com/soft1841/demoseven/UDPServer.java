package com.soft1841.demoseven;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        /**
         * 接受客户端信息
         */
        //创建服务器端口DataframSocket,指定端口
        DatagramSocket socket=new DatagramSocket(8888);
        //创建字节数组，指定接受数据包的大小
        byte[] data=new byte[1024];
        DatagramPacket packet=new DatagramPacket(data,data.length);
        //接收客户端发送的数据
        System.out.println("***服务器已启动，等待客户端发送数据");
        //此方法在接收导数据之前会一直阻塞
        socket.receive(packet);
        //读取数据
        String info=new String(data,0,packet.getLength());
        System.out.println("我是服务器，客户端说"+info);
        /**
         * 向客户端响应数据
         */
        //定义客户端的地址，端口号，数据
        InetAddress address=packet.getAddress();
        int port=packet.getPort();
        byte[] data2="欢迎您！".getBytes();
        //创建数据包含响应的数据信息
        DatagramPacket packet2=new DatagramPacket(data2,data2.length,address,port);
        //响应客户端
        socket.send(packet2);
        //关闭电源
        socket.close();
    }
}
