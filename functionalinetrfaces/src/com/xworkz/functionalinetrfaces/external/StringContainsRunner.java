package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.StringContainsOperation;

public class StringContainsRunner {
    public static void main(String[] args) {
        StringContainsOperation containsOp = (a, b) -> a.contains(b);
        System.out.println("String Contains: " + containsOp.compute("Hello, World!", "World"));
    }
}
