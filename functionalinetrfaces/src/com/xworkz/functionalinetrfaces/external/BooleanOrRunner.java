package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.BooleanOrOperation;

public class BooleanOrRunner {
    public static void main(String[] args) {
        BooleanOrOperation orOp = (a, b) -> a || b;
        System.out.println("Boolean OR: " + orOp.compute(true, false));
    }
}
