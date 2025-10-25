package com.xworkz.company.external;

import com.xworkz.company.briagde.LongSubtractOperation;

public class LongSubtractRunner {
    public static void main(String[] args) {
        LongSubtractOperation sub = (a, b) -> a - b;
        System.out.println("Long Subtraction: " + sub.compute(100L, 50L));
    }
}
