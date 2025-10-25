package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.StringConcatOperation;

public class StringConcatRunner {
    public static void main(String[] args) {
        StringConcatOperation concat = (a, b) -> a + b;
        System.out.println("String Concat: " + concat.compute("Hello, ", "World!"));
    }
}
