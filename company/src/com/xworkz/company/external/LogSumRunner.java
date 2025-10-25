package com.xworkz.company.external;

import com.xworkz.company.briagde.LogSumOperation;

public class LogSumRunner {
    public static void main(String[] args) {
        LogSumOperation op = (a, b) -> Math.log(a + b);
        System.out.println("Log Sum: " + op.compute(10, 5));
    }
}
