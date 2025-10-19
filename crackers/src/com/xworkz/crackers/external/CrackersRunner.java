package com.xworkz.crackers.external;

import com.xworkz.crackers.brigade.*;
import com.xworkz.crackers.internal.*;

import static java.awt.SystemColor.info;

public class CrackersRunner {
    public static void main(String[] args) {
        Shorts shorts=new Shorts(13,"multicolor");
        ColorShorts colorShorts=new TotalShorts();
        int number= colorShorts.listOfShorts(shorts);
        System.out.println(number);

        Sprakels sprakels = new Sprakels(" electric sparkles",15);
        SprakelsColors colors=new Colors();
        long stright =colors.cm(sprakels);
        System.out.println(stright);

        Rockets rockets = new Rockets(12.0,"rockets");
        Crackers crackers = new CrackersImplm();
       double results = crackers.range(rockets);
        System.out.println(results);

        CrackersPots crackersPots=new CrackersPots("flowers",false);
        Crackers pots=new CrackersImplm();
        boolean value=pots.isThere(crackersPots);
        System.out.println(value);


        CrackersInfo info = new CrackersInfo(120, "aravind");
        Crackers cracker = new CrackersImplm();
        String result = cracker.crackerName(info);
        System.out.println(result);

    }
}



