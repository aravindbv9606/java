package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.MinOperation;

public class MinRunner {
    public static void main(String[] args) {
        MinOperation min = (a, b) -> Math.min(a, b);
        System.out.println("Min: " + min.compute(10, 5));
    }
}
