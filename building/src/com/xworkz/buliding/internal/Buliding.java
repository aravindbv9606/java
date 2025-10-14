package com.xworkz.buliding.internal;

public class Buliding {
    public int investement;
    Floors floors;
    public Buliding(int investement, Floors floors) {
        this.investement = investement;
        this.floors = floors;
    }
    public void bulid(){
        System.out.println("Buliding..."+investement);
        System.out.println("floors..."+floors.noOfFloors);
        System.out.println("floors name..."+floors.name);

    }
}
