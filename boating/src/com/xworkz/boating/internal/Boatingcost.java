package com.xworkz.boating.internal;

import com.xworkz.boating.event.BoatinPrice;
import com.xworkz.boating.event.BoatingType;

public class Boatingcost {
    public int price(int seats){
        if(seats<100){
            try{
                throw new BoatinPrice();

            }catch (BoatinPrice boatinPrice){
                boatinPrice.printStackTrace();
                System.out.println("100 for head min");

            }

        }else {
            System.out.println("mix 120 for head");
        }
        return seats;
    }
}
