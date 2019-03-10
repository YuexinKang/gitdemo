package com.soft1841.sm;

public class SpcialParallelogram{
    public static void main(String[] args) {
        DrawImage[] images={new Rectangle(),new Square(),new Diamond()};
       for(int i =0;i< images.length;i++){
           images[i].draw();
       }

    }
}
