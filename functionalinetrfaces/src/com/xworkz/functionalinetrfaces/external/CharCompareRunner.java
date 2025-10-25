package com.xworkz.functionalinetrfaces.external;

import com.xworkz.functionalinetrfaces.brigade.CharCompareOperation;

public class CharCompareRunner {
    public static void main(String[] args) {
        CharCompareOperation compare = (a, b) -> a == b;
        System.out.println("Char Compare: " + compare.compute('A', 'A'));
    }
}
