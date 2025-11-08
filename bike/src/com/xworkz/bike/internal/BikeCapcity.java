package com.xworkz.bike.internal;

import com.xworkz.bike.event.BikeCap;

public class BikeCapcity {
    public int numberLitter(int ltr){
        if(ltr==8){
            try
            {
                throw new BikeCap();

            }catch (BikeCap bikeCap){
                bikeCap.printStackTrace();
                System.out.println("total number 8 ltr");
            }

        }else {
            System.out.println("total number more than ltr");
        }
        return ltr;
    }


}
