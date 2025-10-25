package com.xworkz.longoperations.External;

public class FloatAddRunner {
    public static void main(String[] args) {
        FloatAddOperation add = (a, b) -> a + b;
        System.out.println("Float Addition: " + add.compute(10.5f, 5.2f));
    }
}
