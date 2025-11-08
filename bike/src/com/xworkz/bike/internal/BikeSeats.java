package com.xworkz.bike.internal;

import com.xworkz.bike.event.BikeSeat;

public class BikeSeats {
    public int numberSeats(int seats) {
        if (seats < 2) {
            try {
                throw new BikeSeat();
            } catch (BikeSeat bikeSeat) {
                bikeSeat.printStackTrace();
                System.out.println("2 seats only bike range");

            }

        } else {
            System.out.println("3 seats  bike out of range");
        }

        return seats;
    }
}
