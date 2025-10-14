package com.xworkz.buliding.external;

import com.xworkz.buliding.internal.Floors;
import com.xworkz.buliding.internal.Rooms;

public class Apartment {
    public static void main(String[] args) {

        Floors f = new Floors(1,"raja");
        Rooms r = new Rooms(10,"rani",10,f);
        r. bulid();
    }
}
