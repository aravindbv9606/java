package com.xworkz.sum.brigade;

@FunctionalInterface
public interface SimpleInterest {
    double calculate(double principal, double rate, double time);
}
