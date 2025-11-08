package com.xworkz.bike.internal;

import com.xworkz.bike.event.BikeCost;

public class BikePrice {
   public int bikeCost(int Price){
        if(Price < 98){
            try{
                throw new BikeCost();

            }catch (BikeCost bikeCost){
                bikeCost.printStackTrace();
                System.out.println("min price is 98 thouse rupey only");
            }
        }else {
            System.out.println("mix is price 98 above rupey only ");
        }
        return Price;
    }



}
