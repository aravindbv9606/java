package com.xworkz.bike.internal;

import com.xworkz.bike.event.BikeRange;

public class BikeRanges {
    public int totalRnge(int total ){
        if(total < 60) {


            try {
                throw new BikeRange();

            }catch (BikeRange bikeRange){
                bikeRange.printStackTrace();
                System.out.println("not good kl/hr number of the bike range");
            }
        }else{
            System.out.println("best number kl/hr of the bike range");
        }
        return total;
    }
}
