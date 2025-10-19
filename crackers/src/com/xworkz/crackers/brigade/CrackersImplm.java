package com.xworkz.crackers.brigade;

import com.xworkz.crackers.internal.CrackersInfo;
import com.xworkz.crackers.internal.CrackersPots;
import com.xworkz.crackers.internal.Rockets;

public class CrackersImplm implements Crackers {
    @Override
    public String crackerName(CrackersInfo crackersInfo) {
        if (crackersInfo.price < 50) {
            return "high-range crackers";
        } else
            return "low-range crackers";

    }


    @Override
    public Boolean isThere(CrackersPots crackersPots) {
        if (crackersPots.crackerName.isEmpty()) {
            return true;
        } else
            return false;
    }

    @Override
    public Double range(Rockets rockets) {
        if (rockets.feet < 50.0) {
            return 14.0;

        } else
            return 15.0;

    }

}



