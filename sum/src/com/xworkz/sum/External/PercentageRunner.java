package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Percentage;
import com.xworkz.sum.brigade.PercentageImpl;

public class PercentageRunner {
    public static void main(String[] args) {
        Percentage percentage = new PercentageImpl();
        double result = percentage.calculate(500, 420);
        System.out.println("Percentage = " + result + "%");
    }
}
