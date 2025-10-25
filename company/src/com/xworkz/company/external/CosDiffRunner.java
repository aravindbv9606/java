package com.xworkz.company.external;

import com.xworkz.company.briagde.CosDiffOperation;

public class CosDiffRunner {
    public static void main(String[] args) {
        CosDiffOperation op = (a, b) -> Math.cos(a) - Math.cos(b);
        System.out.println("Cos Difference: " + op.compute(10, 5));
    }
}
