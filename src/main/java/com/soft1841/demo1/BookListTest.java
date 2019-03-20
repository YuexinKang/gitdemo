package com.soft1841.demo1;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"最好的我们",30.3));
        list.add(new Book(2,"橘生淮南",25.2));
        list.add(new Book(3,"你好，旧时光",20.5));
        System.out.println("----------图书信息----------");
        System.out.println("书名     作者      价格     ");
        System.out.println(list);
        System.out.println("插入之后");
        list.add(0,new Book(1,"何以笙箫默",30.0));
        System.out.println(list);
        list.remove(2);
        System.out.println("删除之后");
        System.out.println(list);
        list.set(1,new Book(1,"你好，旧时光",20.5));
        System.out.println(list.indexOf(new Book(1,"何以笙箫默",30.0)));
        System.out.println(list.lastIndexOf(new Book(1,"何以笙箫默",30.0)));
    }
}
