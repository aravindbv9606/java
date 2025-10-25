package com.xworkz.longoperations.External;

public class LongModuloRunner {
    public static void main(String[] args) {
        LongModuloOperation mod = (a, b) -> a % b;
        System.out.println("Long Modulo: " + mod.compute(100L, 50L));
    }
}
