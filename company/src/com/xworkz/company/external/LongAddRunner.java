package com.xworkz.company.external;

import com.xworkz.company.briagde.LongAddOperation;

public class LongAddRunner {
    public static void main(String[] args) {
        LongAddOperation add = (a, b) -> a + b;
        System.out.println("Long Addition: " + add.compute(100L, 50L));
    }
}
