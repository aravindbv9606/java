package com.xworkz.filpkart.internal;

public class Fashion {
    int noOfDesign;
    String name;

    public Fashion(int noOfDesign, String name) {
        this.noOfDesign = noOfDesign;
        this.name = name;

    }

public void displayFashion() {

    System.out.println(noOfDesign + " " + name);


    }
}
