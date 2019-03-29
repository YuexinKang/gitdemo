package com.soft1841.demo2;

import java.io.File;

public class UpLoadTest {
    public static void main(String[] args) {
        String arr[] ={"image","video","docment"};
        for (int i =0;i<=arr.length;i++){
            File path = new File("D:/UpLoad"+"/"+arr[i]);
        }

    }
}
