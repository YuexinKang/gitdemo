package com.soft1841.demo2;

import java.io.File;
import java.io.IOException;



public class FolderTest {
    public static void main(String[] args) throws IOException {

        //创建目录
        File path = new File("D:/20190325");
        if (!path.exists()){
            path.mkdirs();
        }
        //创建文件
        File file = new File(path+"/"+"hello-163300.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
