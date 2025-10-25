package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.SquareSumOperation;

public class SquareSumRunner {
    public static void main(String[] args) {
        SquareSumOperation sqSum = (a, b) -> a * a + b * b;
        System.out.println("Square Sum: " + sqSum.compute(10, 5));
    }
}
