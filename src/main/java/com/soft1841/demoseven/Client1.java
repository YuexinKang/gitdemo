package com.soft1841.demoseven;

import java.io.IOException;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",10086);
        System.out.println(socket.getInetAddress()+"连接成功");

    }
}
