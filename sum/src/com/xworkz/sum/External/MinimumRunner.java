package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Minimum;
import com.xworkz.sum.brigade.MinimumImpl;

public class MinimumRunner {
    public static void main(String[] args) {
        Minimum minOp = new MinimumImpl();
        int result = minOp.findMin(10, 50, 5, 20, 30);
        System.out.println("Minimum = " + result);
    }
}
