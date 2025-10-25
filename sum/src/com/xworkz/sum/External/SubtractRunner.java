package com.xworkz.sum.External;

import com.xworkz.sum.brigade.SubtractOperation;
import com.xworkz.sum.brigade.SubtractOperationImpl;

class SubtractRunner {
    public static void main(String[] args) {
        SubtractOperationImpl impl = new SubtractOperationImpl();
        SubtractOperation sub = (a, b) -> a - b;
        int result = impl.subtract(10, 20);
        System.out.println("Sum = " + result);

    }
}