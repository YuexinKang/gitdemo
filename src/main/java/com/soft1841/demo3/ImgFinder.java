package com.soft1841.demo3;

import java.io.File;

public class ImgFinder {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D:/";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录，放在file数组中
        File[] files = file.listFiles();
        //遍历file数组
        for (File f:files) {
            //若非目录（即文件），则打印
            if (!f.isDirectory()){
                //判断文件类型
                //获取文件名
                String srcFileName = f.getName();
                //通过正则表达式将文件名分为文件名和文件后缀名
                int position = srcFileName.indexOf(".");
                String suffixName = srcFileName.substring(position);
                //判断文件后缀名是否为图片后缀名，如果是（即图片），则打印
               if(suffixName.equals(".jpg")||suffixName.equals(".png"));
               System.out.println(f);
            }

        }
    }
}
