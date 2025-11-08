package com.xworkz.boating.internal;

import com.xworkz.boating.event.BoatingType;

public class Boating {
    public int boatName(int seats){
        if(seats<10){
            try{
                throw new BoatingType();

            }catch (BoatingType boatingType){
                boatingType.printStackTrace();
                System.out.println("BoatingType onle 10 seats");

            }

        }else {
            System.err.println("BoatingType onle 10 seats");
        }
        return seats;
    }
}
