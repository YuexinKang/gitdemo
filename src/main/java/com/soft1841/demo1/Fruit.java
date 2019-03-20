package com.soft1841.demo1;

/**
 * 自定义水果类，实现比较类接口，按照价格升序排列
 * 实现Cpmparable接口，必须强制重写其compareTo()方法
 */
public class Fruit implements Comparable<Fruit> {
    private String name;
    private Integer price;

    public Fruit() {
    }

    public Fruit(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit fruit) {
        return this.getPrice()-fruit.getPrice();
    }
}
