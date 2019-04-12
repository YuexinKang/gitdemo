package com.soft1841.demo4;

public class RunableTest implements Runnable {
    private int count=10;
    public static void main(String[] args) {
        Thread threadobj = new Thread(new RunableTest());
        threadobj.start();
    }
    @Override
    public void run() {
        while(true){
            System.out.print(count+"   ");
            if (--count==0){
                break;
            }
        }
    }



}
