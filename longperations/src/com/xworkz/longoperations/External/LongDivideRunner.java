package com.xworkz.longoperations.External;

import com.xworkz.longoperations.briagde.LongDivideOperation;

public class LongDivideRunner {
    public static void main(String[] args) {
        LongDivideOperation div = (a, b) -> b != 0 ? a / b : 0L;
        System.out.println("Long Division: " + div.compute(100L, 50L));
    }
}
