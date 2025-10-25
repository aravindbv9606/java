
package com.xworkz.calculations.Externale;


import com.xworkz.calculations.briagade.Operation;


public class Runner {
    public static void main(String[] args) {

        Operation add = (a, b) -> a + b;
        System.out.println(add.tempDeatils(2, 3));

    }
}