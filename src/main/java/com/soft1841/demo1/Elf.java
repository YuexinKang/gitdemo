package com.soft1841.demo1;

import com.soft1841.demo1.dao.Move;
import com.soft1841.demo1.dao.Sing;

public class Elf implements Move, Sing {

    public void move() {

        System.out.println("移动");
    }


    public void sing() {
        System.out.println("唱歌");

    }

    public static void main(String[] args) {
        Elf elf = new Elf();
        System.out.println("精灵可以：");
        elf.move();
        elf.sing();
    }
}
