package com.soft1841.demo1;

public class SA {
    public static void main(String[] args) {
        Shape shape=new Rectangle();
        shape.name="矩形";
        shape.shape();
        shape =new Circle();
        shape.name="圆形";
        shape.shape();
    }
}
