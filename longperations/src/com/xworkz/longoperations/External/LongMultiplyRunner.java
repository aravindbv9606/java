package com.xworkz.longoperations.External;

import com.xworkz.longoperations.briagde.LongMultiplyOperation;

public class
LongMultiplyRunner {
    public static void main(String[] args) {
        LongMultiplyOperation mul = (a, b) -> a * b;
        System.out.println("Long Multiplication: " + mul.compute(100L, 50L));
    }
}
