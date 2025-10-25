package com.xworkz.longoperations.External;

public class FloatMultiplyRunner {
    public static void main(String[] args) {
        FloatMultiplyOperation mul = (a, b) -> a * b;
        System.out.println("Float Multiplication: " + mul.compute(10.5f, 5.2f));
    }
}
