package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.FloatMaxOperation;

public class FloatMaxRunner {
    public static void main(String[] args) {
        FloatMaxOperation max = (a, b) -> Math.max(a, b);
        System.out.println("Float Max: " + max.compute(10.5f, 5.2f));
    }
}
