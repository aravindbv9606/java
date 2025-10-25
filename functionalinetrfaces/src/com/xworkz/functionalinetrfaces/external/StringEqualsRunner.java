package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.StringEqualsOperation;

public class StringEqualsRunner {
    public static void main(String[] args) {
        StringEqualsOperation equalsOp = (a, b) -> a.equals(a);
        System.out.println("String Equals: " + equalsOp.compute("Hi", "Hello"));
    }
}
