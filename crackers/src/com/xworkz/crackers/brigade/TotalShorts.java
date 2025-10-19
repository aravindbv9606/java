package com.xworkz.crackers.brigade;

import com.xworkz.crackers.internal.Shorts;

public class TotalShorts implements ColorShorts {

    @Override
    public int listOfShorts(Shorts shorts) {
        if (shorts.total < 40) {
            return 12;
        }
        return 29;
    }
}





