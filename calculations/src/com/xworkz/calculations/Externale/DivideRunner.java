package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.DivideOperation;

public class DivideRunner {
    public static void main(String[] args) {
        DivideOperation div = (a, b) -> b != 0 ? a / b : Double.NaN;
        System.out.println("Division: " + div.compute(10, 5));
    }
}
