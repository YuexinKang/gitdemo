package com.soft1841.demo1;

public class PokerCard {
    private String color;
    private Integer  number;

    public PokerCard() {
    }

    public PokerCard(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PokerCard{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
