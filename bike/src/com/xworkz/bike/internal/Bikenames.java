package com.xworkz.bike.internal;

import com.xworkz.bike.event.BikeName;

public class Bikenames {
    public String names(String name){
        if (name=="aravi"){
            try {
                throw new BikeName();

            }catch (BikeName e){
                e.printStackTrace();
                System.out.println("BikeName error");
            }
        }else  {
            System.err.println("BikeName not correct");
        }
        return name;
    }
}
