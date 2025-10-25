package com.xworkz.longoperations.External;

public class FloatDivideRunner {
    public static void main(String[] args) {
        FloatDivideOperation div = (a, b) -> b != 0 ? a / b : Float.NaN;
        System.out.println("Float Division: " + div.compute(10.5f, 5.2f));
    }
}
