package com.xworkz.sum.brigade;

public class MaximumImpl implements Maximum {

    @Override
    public int findMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided!");
            return Integer.MIN_VALUE; // or 0 if you prefer
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
