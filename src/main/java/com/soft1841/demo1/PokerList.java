package com.soft1841.demo1;
import java.util.*;

public class PokerList {
    public static void main(String[] args) {
        // 1.1 创建牌盒
        ArrayList<String> pokerBox = new ArrayList<>();
        //1.2创建花色集合
        ArrayList<String> colors = new ArrayList<>();
        //1.3 创建数字集合
        ArrayList<String> numbers = new ArrayList<>();
        //1.4 分别给花色 以及 书数字集合添加元素
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");

        for (int i = 2; i <= 10; i++) {  // 2 - 10 的数字
            numbers.add(i + "");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //1.5创造牌 拼接牌操作
        // 拿出每一个花色 然后跟每一个数字 进行结合 存储到牌盒中
        for (String color : colors) {
            // color 每一个花色
            // 遍历数字集合
            for (String number : numbers) {
                // 结合
                String card = color + number;
                //存储到牌盒中
                pokerBox.add(card);
            }
        }
        // 1.6 大小王
        pokerBox.add("小🐢");
        pokerBox.add("大🐢");
        //System.out.println(pokerBox);
        //洗牌 是不是就是将 牌盒中的 牌的索引打乱
        //Collection类  工具类 都是静态方法
        // shuffer方法
        /**
         * Static void shuffer(List<?>List)
         * 使用默认随机源指定列表进行置换
         */
        //2 : 洗牌
        Collections.shuffle(pokerBox);
        // 3 发牌
        //3.1 创建 三个 玩家集合 创建一个底牌集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历 牌盒 必须知道索引
        for (int i = 0; i < pokerBox.size(); i++) {
            // 获取牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存到 底牌集合中
            if (i >= 51) {
                dipai.add(card);
            } else {
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);
                } else {
                    player3.add(card);
                }
            }
        }
        System.out.println("张学友" + player1);
        System.out.println("周杰伦" + player2);
        System.out.println("周星驰" + player3);
        System.out.println("底牌" + dipai);
    }
}
