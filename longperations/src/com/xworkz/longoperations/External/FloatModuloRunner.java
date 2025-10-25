package com.xworkz.longoperations.External;

public class FloatModuloRunner {
    public static void main(String[] args) {
        FloatModuloOperation mod = (a, b) -> a % b;
        System.out.println("Float Modulo: " + mod.compute(10.5f, 5.2f));
    }
}
