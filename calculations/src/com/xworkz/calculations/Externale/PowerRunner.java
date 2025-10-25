package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.PowerOperation;

public class PowerRunner {
    public static void main(String[] args) {
        PowerOperation power = (a, b) -> Math.pow(a, b);
        System.out.println("Power: " + power.compute(10, 5));
    }
}
