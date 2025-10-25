package com.xworkz.company.external;

import com.xworkz.company.briagde.SinSumOperation;

public class SinSumRunner {
    public static void main(String[] args) {
        SinSumOperation op = (a, b) -> Math.sin(a) + Math.sin(b);
        System.out.println("Sin Sum: " + op.compute(10, 5));
    }
}
