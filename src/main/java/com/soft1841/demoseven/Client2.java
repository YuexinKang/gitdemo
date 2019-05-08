package com.soft1841.demoseven;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("10.40.168.7",10010);
        System.out.println("成功连上服务器");
        //客户端需要发送的文件，先通过字节输入流输入字节数组b
        File file=new File("D:/1.jpg");
        byte[] b=new byte[(int) file.length()];
        InputStream is=new FileInputStream(file);
        is.read(b);
        //将数组b通过缓冲字节输出流传送出去
        BufferedOutputStream bos=new BufferedOutputStream(client.getOutputStream());
        bos.write(b);
        is.close();
        bos.close();
    }
}
