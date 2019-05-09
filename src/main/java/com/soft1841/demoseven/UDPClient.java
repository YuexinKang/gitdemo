package com.soft1841.demoseven;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        /**
         * 向客户端发送数据
         */
        //定义服务器地址，端口号，数据
        InetAddress address=InetAddress.getByName("localhost");
        int port=8888;
        byte[] data="用户名：admin;密码：123".getBytes();
        //创建数据包包含发送的数据信息
        DatagramPacket packet= new DatagramPacket(data,data.length,address,port);
        //创建DatagramsSocket对象
        DatagramSocket  socket=new DatagramSocket();
        //向服务器发送数据报
        socket.send(packet);
        /**
         * 接受服务器响应端的数据
         */
        //创建数据包，用于接收服务器端响应的数据
        byte[] data2=new byte[1024];
        DatagramPacket packet2=new DatagramPacket(data2,data.length);
        //接收服务器响应的数据
        socket.receive(packet);
        //读取数据
        String reply=new String(data2,0,packet2.getLength());
        System.out.println("我是客户端，服务器说"+reply);
        //关闭资源
        socket.close();


    }
}
