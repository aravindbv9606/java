package com.xworkz.crackers.brigade;

import com.xworkz.crackers.internal.Sprakels;

public class Colors implements SprakelsColors
{

    @Override
    public long cm(Sprakels sprakels) {
        if(sprakels.cm<20){
            return 12;
        }else

            return 50;

    }
}
