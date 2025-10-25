package com.xworkz.sum.brigade;

public class SimpleInterestImpl implements SimpleInterest {

    @Override
    public double calculate(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
