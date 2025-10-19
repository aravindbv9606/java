package com.xworkz.shops.internal;

public class ShopsGoodWill {
    String name;
    String description;
    float price;
    char gread;
    public ShopsGoodWill(String name, String description, float price, char gread) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.gread = gread;
        System.out.println("ShopsGoodWill name constructor:"+name);
        System.out.println("ShopsGoodWill description:"+description);
        System.out.println("ShopsGoodWill price:"+price);
        System.out.println("ShopsGoodWill gread:"+gread);




    }
}
