package com.xworkz.boating.external;

import com.xworkz.boating.internal.*;

public class boatRunner {
    public static void main(String[] args) {
        Boating b = new Boating();
        b.boatName(10);
        BoatingContectNumber c = new BoatingContectNumber();
        c.numbers(9);
        Boatingcost bc = new Boatingcost();
        bc.price(9);
        BoatingRanges r = new BoatingRanges();
        r.ten(10);
        BoatingSafty s = new BoatingSafty();
        s.isSafe(true);

    }
}
