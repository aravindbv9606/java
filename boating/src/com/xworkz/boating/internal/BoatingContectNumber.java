package com.xworkz.boating.internal;

import com.xworkz.boating.event.BoatingContect;
import com.xworkz.boating.event.BoatingType;

public class BoatingContectNumber {
    public int numbers(int digit){
        if(digit<10){
            try{
                throw new BoatingContect();

            }catch (BoatingContect boatingContect){
                boatingContect.printStackTrace();
                System.out.println("BoatingType onle 10 ");

            }

        }else {
            System.out.println("BoatingType onle 10 ");
        }
        return digit;
    }
}
