package com.xworkz.boating.internal;

import com.xworkz.boating.event.BoatingRange;
import com.xworkz.boating.event.BoatingType;

public class BoatingRanges {
    public int ten(int krlm){
        if(krlm<10){
            try{
                throw new BoatingRange();

            }catch (BoatingRange boatingRange){
                boatingRange.printStackTrace();
                System.out.println("12 kl/hr min");

            }

        }else {
            System.out.println("15 kl/hr mix");
        }
        return krlm;
    }
}
