package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Maximum;
import com.xworkz.sum.brigade.MaximumImpl;

public class MaximumRunner {
    public static void main(String[] args) {
        Maximum maxOp = new MaximumImpl();
        int result = maxOp.findMax(10, 50, 5, 20, 30);
        System.out.println("Maximum = " + result);
    }
}
