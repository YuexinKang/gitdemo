package com.soft1841.demo3;
/**
 * 带缓冲的输入输出流
 * @author Yuexin Kang
 * 2019.04.04
 */

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        String content[] ={
                "你不喜欢我","我一点都不介意","因为我活下来","不是为了取悦你的"};
        //创建文本对象
        File file=new File("D:/words.txt");
        //创建FileReader类对象
        FileWriter fileWriter;

        {
            try {
                fileWriter = new  FileWriter(file);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                //循环遍历数组
                for (int k=0;k<content.length;k++){
                    //将字符串数组的元素写到磁盘文件中
                    bufferedWriter.write(content[k]);
                    //将数组的单个元素写到磁盘文件中
                    bufferedWriter.newLine();
                }
                //将BufferedWriter关闭
                bufferedWriter.close();
                //将FilerWriter关闭
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                //创建FilerReader类对象
                FileReader fileReader=new FileReader(file);
                //创建BufferedReader对象
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                //创建字符串对象
                String s=null;
                //声明int型变量
                int i=0;
                while ((s=bufferedReader.readLine())!=null){
                    //将变量做自增运算
                    i++;
                    //输出文件数据
                    System.out.println("第"+i+"行"+s);
                }
                //将BufferedReader流关闭
                bufferedReader.close();
                //将FilerReader流关闭
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
