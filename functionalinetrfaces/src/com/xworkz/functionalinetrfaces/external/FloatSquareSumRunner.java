package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.FloatSquareSumOperation;

public class FloatSquareSumRunner {
    public static void main(String[] args) {
        FloatSquareSumOperation sqSum = (a, b) -> a * a + b * b;
        System.out.println("Float Square Sum: " + sqSum.compute(10.5f, 5.2f));
    }
}
