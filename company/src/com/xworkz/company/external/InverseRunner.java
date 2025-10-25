package com.xworkz.company.external;

import com.xworkz.company.briagde.InverseOperation;

public class InverseRunner {
    public static void main(String[] args) {
        InverseOperation op = (a, b) -> 1 / (a + b);
        System.out.println("Inverse Sum: " + op.compute(10, 5));
    }
}
