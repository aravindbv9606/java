package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.FloatAverageOperation;

public class FloatAverageRunner {
    public static void main(String[] args) {
        FloatAverageOperation avg = (a, b) -> (a + b) / 2;
        System.out.println("Float Average: " + avg.compute(10.5f, 5.2f));
    }
}
