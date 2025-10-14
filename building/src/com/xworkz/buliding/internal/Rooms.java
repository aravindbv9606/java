package com.xworkz.buliding.internal;

public class Rooms extends Buliding {
    int noOfRooms;
    String name;
    public Rooms(int noOfRooms, String name,int investment, Floors floors) {
        super(investment, floors);

    }
    public void displayRooms(){
        System.out.println("Rooms.noOfRooms=" + noOfRooms);
        System.out.println("Rooms.name=" + name);
        System.out.println("investment"+investement);
        System.out.println("Rooms.floors="+floors);
    }
}
