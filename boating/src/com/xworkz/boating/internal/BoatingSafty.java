package com.xworkz.boating.internal;

import com.xworkz.boating.event.BoatingSafe;

public class BoatingSafty {
    public boolean isSafe(boolean yessafe){
        if(yessafe==true){
            try{
                throw new BoatingSafe();

            }catch (BoatingSafe boatingSafe){
              boatingSafe.printStackTrace();
                System.out.println("yes safty is there");

            }

        }else {
            System.out.println("yes there note saftey");
        }
        return yessafe;
    }
}
