package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.AverageOperation;

public class AverageRunner {
    public static void main(String[] args) {
        AverageOperation avg = (a, b) -> (a + b) / 2;
        System.out.println("Average: " + avg.compute(10, 5));
    }
}
