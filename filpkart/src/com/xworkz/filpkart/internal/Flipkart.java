package com.xworkz.filpkart.internal;

public class Flipkart {
    int price;
    String name;
Fashion fashion;
    public Flipkart(int price, String name, Fashion fashion) {
        this.price = price;
        this.name = name;
this.fashion = fashion;
    }
        public void displayFlipkart(){
            System.out.println(this.price);
            System.out.println(this.name);
            System.out.println(fashion.noOfDesign);
            System.out.println(fashion.name);



    }
}
