package com.xworkz.longoperations.External;

public class LongMaxRunner {
    public static void main(String[] args) {
        LongMaxOperation max = (a, b) -> Math.max(a, b);
        System.out.println("Long Max: " + max.compute(100L, 50L));
    }
}
