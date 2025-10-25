package com.xworkz.company.external;

import com.xworkz.company.briagde.AbsoluteDifferenceOperation;

public class AbsoluteDifferenceRunner {
    public static void main(String[] args) {
        AbsoluteDifferenceOperation op = (a, b) -> Math.abs(a - b);
        System.out.println("Absolute Difference: " + op.compute(10, 5));
    }
}
