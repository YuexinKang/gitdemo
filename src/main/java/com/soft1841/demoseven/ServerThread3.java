package com.soft1841.demoseven;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread3 implements Runnable {
    private Socket socket;

    public ServerThread3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功" );
        String info="只是一条服务器通知";
        OutputStream outputStream=null;
        try {
            outputStream=socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream printStream=new PrintStream(outputStream);
        printStream.print(info);
        printStream.close();

    }
}
