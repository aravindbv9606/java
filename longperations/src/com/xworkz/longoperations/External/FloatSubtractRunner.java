package com.xworkz.longoperations.External;

public class FloatSubtractRunner {
    public static void main(String[] args) {
        FloatSubtractOperation sub = (a, b) -> a - b;
        System.out.println("Float Subtraction: " + sub.compute(10.5f, 5.2f));
    }
}
