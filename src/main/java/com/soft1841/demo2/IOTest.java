package com.soft1841.demo2;

import java.io.*;
import java.util.Scanner;

public class IOTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要写入文件的内容");
        String string = scanner.next();
        System.out.println(string);
        byte[] bytes = string.getBytes();
        File destFile = new File("D:/IO/hello.txt");
        OutputStream out = new FileOutputStream(destFile);
        out.write(bytes);
        out.close();

    }
}
