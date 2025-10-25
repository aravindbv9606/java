package com.xworkz.sum.External;

import com.xworkz.sum.brigade.SimpleInterest;
import com.xworkz.sum.brigade.SimpleInterestImpl;

public class SimpleInterestRunner {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterestImpl();
        double result = si.calculate(5000, 5, 2);
        System.out.println("Simple Interest = " + result);
    }
}
