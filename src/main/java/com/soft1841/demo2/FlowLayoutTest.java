package com.soft1841.demo2;
/**
 * 使用FlowLayout流布局拓展训练
 * 3.25
 */

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest(){
        setTitle("题目");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        container.add(new JLabel("下面四句诗，那一句是描写夏天的?"));
        container.add(new JButton(" A 秋风萧瑟天气凉，草木摇荡露为霜"));
        container.add(new JButton(" B 白雪纷飞何所似，撒盐空中差可拟"));
        container.add(new JButton(" C 接天连日无穷碧，映日荷花别样红"));
        container.add(new JButton(" D 竹外桃花三两枝，春江水暖鸭先知"));
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutTest();

    }
}
