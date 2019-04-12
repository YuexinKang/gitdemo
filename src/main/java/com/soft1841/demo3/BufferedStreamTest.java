package com.soft1841.demo3;
/**
 * 带缓冲的输入输出流
 * @author Yuexin Kang
 * 2019.3.4
 */

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.channels.Channel;

public class BufferedStreamTest {
    public static void main(String[] args) {
        // 定义字符数组
        String content[] = {"你不喜欢我，","我一点都不介意。","因为我活下来,","不是为了取悦你的!"};
        // 创建文件对象
        File file = new File("D:/word.txt");
        // 创建FileOutputStream对象
        FileOutputStream fos = null;
        // 创建BufferedOutputString对象
        BufferedOutputStream  bos = null;
        //创建FileInputStream对象
        FileInputStream fis = null;
        // 创建 BufferedInputStream对象
        BufferedInputStream bis = null;
        try {
            //实例化FileOutputStream对象
            fos = new FileOutputStream(file);
            //实例化BufferedOutputStream对象
            bos = new BufferedOutputStream(fos);
            // 创建可以容纳1024个字节的缓冲区
            byte[] bContent = new byte[1024];
            //循环遍历数组
            for (int k = 0; k < content.length; k++){
                bContent = content[k].getBytes();
                bos.write(bContent);
            }
            System.out.println("写入成功！\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            byte[] bContent = new byte[1024];
            int len = bis.read(bContent);
            System.out.println("文件中的信息是：" + new String(bContent,0,len));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bis.close();
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
