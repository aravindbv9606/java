package com.xworkz.longoperations.External;

public class LongMinRunner {
    public static void main(String[] args) {
        LongMinOperation min = (a, b) -> Math.min(a, b);
        System.out.println("Long Min: " + min.compute(100L, 50L));
    }
}
