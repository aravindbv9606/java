package com.xworkz.sum.brigade;

public class PercentageImpl implements Percentage {

    @Override
    public double calculate(int total, int obtained) {
        if (total == 0) {
            System.out.println("Total cannot be zero!");
            return 0;
        }
        return (obtained * 100.0) / total;
    }
}
