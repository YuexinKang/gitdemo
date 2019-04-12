package com.soft1841.demo4;

/**
 * 多线程的起步--继承Thread类
 * 2019.40.08
 */
//指定类继承Thread类
public class ThreadTest extends Thread {
    private int count=10;
    //重写run()方法
    public void run(){
        while(true){
            //打印count变量
            System.out.print(count+"   ");
            //是count变量自减，当自减为0时，退出循环
            if (--count==0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        ThreadTest test = new ThreadTest();
        //启动线程
        test.start();
    }
}
