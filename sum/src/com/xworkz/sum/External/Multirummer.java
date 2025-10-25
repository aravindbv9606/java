package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Multiple;
import com.xworkz.sum.brigade.MultipleImp;

public class Multirummer {
    public static void main(String[] args) {

        Multiple multiple = new MultipleImp();
        Multiple m1 = (int a, int b) -> a*b;
        int number= m1.multi(12,15);
        System.out.println(number);


    }
}
