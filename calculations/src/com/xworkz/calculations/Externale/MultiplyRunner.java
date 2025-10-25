package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.MultiplyOperation;

public class MultiplyRunner {
    public static void main(String[] args) {
        MultiplyOperation mul = (a, b) -> a * b;
        System.out.println("Multiplication: " + mul.compute(10, 5));
    }
}
