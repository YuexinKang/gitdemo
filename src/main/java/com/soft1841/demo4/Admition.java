package com.soft1841.demo4;

public class Admition {
    public static void main(String[] args) {
        System.out.println("球员进场......");
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }

    static class A extends Thread{
       public void run(){
            for (int i = 0;i<=11;i++){
                System.out.print("A"+i  );
            }
       }
    }
    static class B extends Thread{
        public void run(){
            for (int i = 0;i<=11;i++){
                System.out.print("B"+i  );
            }
        }
    }
}
