package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.BooleanXorOperation;

public class BooleanXorRunner {
    public static void main(String[] args) {
        BooleanXorOperation xorOp = (a, b) -> a ^ b;
        System.out.println("Boolean XOR: " + xorOp.compute(true, false));
    }
}
