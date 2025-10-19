package com.xworkz.shops.internal;

public class ShopsWholSeller {
    String name;
    double price;
    int quantity;
    public ShopsWholSeller(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("ShopsWholSeller " + name + "price list " + price + "quantity type " + quantity);
    }
}
