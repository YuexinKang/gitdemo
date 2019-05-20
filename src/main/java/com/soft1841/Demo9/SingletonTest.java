package com.soft1841.Demo9;

public class SingletonTest {
    public static void main(String[] args) {
        //编译错误：因为构造方法是不可见的，只能在Singleton类内部调用
        //Singleton object=newSingleton();
        //通过Singleton的类方法Singleton,getInstance()获取唯一可用的对象
        Singleton object=Singleton.getInstance();
        //显示消息
        object.showMessage();
    }
}
