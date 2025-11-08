package com.xworkz.bike.external;

import com.xworkz.bike.event.BikeName;
import com.xworkz.bike.internal.*;

public class BikeRunner {
    public static void main(String[] args) {

        Bikenames bikeName = new Bikenames();
        bikeName.names("aravi");
        BikeRanges bikeRange = new BikeRanges();
        bikeRange.totalRnge(45);
        BikeCapcity bikeCapcity = new BikeCapcity();
        bikeCapcity.numberLitter(9);
        BikeSeats bikeSeats = new BikeSeats();
        bikeSeats.numberSeats(2);
        BikePrice bikePrice = new BikePrice();
        bikePrice.bikeCost(82);
    }
}
