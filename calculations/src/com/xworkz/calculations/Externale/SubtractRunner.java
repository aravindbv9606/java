package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.SubtractOperation;

public class SubtractRunner {
    public static void main(String[] args) {
        SubtractOperation sub = (a, b) -> a - b;
        System.out.println("Subtraction: " + sub.compute(10, 5));
    }
}
