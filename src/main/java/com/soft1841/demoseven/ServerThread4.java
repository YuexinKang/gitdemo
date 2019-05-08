package com.soft1841.demoseven;

import java.io.*;
import java.net.Socket;

public class ServerThread4 implements Runnable {
    private Socket socket;

    public ServerThread4(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+socket.getInetAddress()+"连接成功");
        try {
            File file=new File("D:/1.jpg");
            InputStream inputStream=new FileInputStream(file);
            byte[] b=new byte[(int) file.length()];
            inputStream.read(b);
            OutputStream outputStream=socket.getOutputStream();
            outputStream.write(b);
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
