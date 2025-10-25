package com.xworkz.company.external;

import com.xworkz.company.briagde.ExponentialOperation;

public class ExponentialRunner {
    public static void main(String[] args) {
        ExponentialOperation op = (a, b) -> Math.exp(a + b);
        System.out.println("Exponential Sum: " + op.compute(10, 5));
    }
}
