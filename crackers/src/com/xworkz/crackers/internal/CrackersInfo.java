package com.xworkz.crackers.internal;

public class CrackersInfo {
    public int price;
    String name;

    public CrackersInfo(int price, String name) {
        this.price = price;
        this.name = name;
        System.out.println("price: " +price+" "+"name: " +name);
        //System.out.println("name="+name);
    }
}
