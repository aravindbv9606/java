package com.xworkz.company.external;

import com.xworkz.company.briagde.HypotenuseOperation;

public class HypotenuseRunner {
    public static void main(String[] args) {
        HypotenuseOperation op = (a, b) -> Math.hypot(a, b);
        System.out.println("Hypotenuse: " + op.compute(10, 5));
    }
}
