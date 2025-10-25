package com.xworkz.sum.brigade;

@FunctionalInterface
public interface Percentage {
    double calculate(int total, int obtained);
}