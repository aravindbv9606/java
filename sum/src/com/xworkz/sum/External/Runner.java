package com.xworkz.sum.External;

import com.xworkz.sum.brigade.AddOperation;
import com.xworkz.sum.brigade.AddOperationImpl;

public class Runner {
    public static void main(String[] args) {
       AddOperation impl = new AddOperationImpl();
        AddOperation add = (a, b) -> a+b;
       int result = impl.performAddition(10, 20);
        System.out.println("Sum = " + result);
    }
}
