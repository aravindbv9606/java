package com.xworkz.crackers.brigade;

import com.xworkz.crackers.internal.CrackersInfo;
import com.xworkz.crackers.internal.CrackersPots;
import com.xworkz.crackers.internal.Rockets;


public class CrackersimpmSec implements Crackers {


    @Override
    public String crackerName(CrackersInfo crackersInfo) {
        return "aravind";
    }

    @Override
    public Boolean isThere(CrackersPots crackersPots) {
        return true;
    }

    @Override
    public Double range(Rockets rockets) {
        return 15.0;
    }


}
