package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.FloatMinOperation;

public class FloatMinRunner {
    public static void main(String[] args) {
        FloatMinOperation min = (a, b) -> Math.min(a, b);
        System.out.println("Float Min: " + min.compute(10.5f, 5.2f));
    }
}
