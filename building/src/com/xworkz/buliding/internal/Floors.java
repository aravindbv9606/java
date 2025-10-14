package com.xworkz.buliding.internal;

public class Floors {
    public int noOfFloors;
    String name;

    public Floors(int noOfFloors, String name) {
        this.noOfFloors = noOfFloors;
        this.name = name;

    }

  public void floor() {

      System.out.println("Floors.noOfFloors=" + noOfFloors);
      System.out.println("Floors.name=" + name);
    }
}
