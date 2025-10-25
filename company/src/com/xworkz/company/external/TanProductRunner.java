package com.xworkz.company.external;

import com.xworkz.company.briagde.TanProductOperation;

public class TanProductRunner {
    public static void main(String[] args) {
        TanProductOperation op = (a, b) -> Math.tan(a) * Math.tan(b);
        System.out.println("Tan Product: " + op.compute(10, 5));
    }
}
