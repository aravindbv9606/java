package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.MaxOperation;

public class MaxRunner {
    public static void main(String[] args) {
        MaxOperation max = (a, b) -> Math.max(a, b);
        System.out.println("Max: " + max.compute(10, 5));
    }
}
