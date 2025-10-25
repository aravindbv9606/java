package com.xworkz.sum.brigade;

public class MinimumImpl implements Minimum {

    @Override
    public int findMin(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers provided!");
            return Integer.MAX_VALUE; // or 0 if you prefer
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
