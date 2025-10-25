package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Division;
import com.xworkz.sum.brigade.Divission;

public class DivissionRunner {
    public static void main(String[] args) {
        Division division= new Divission();
        Division div=(int a, int b)-> a%b;
        int number= division.div(1000,150);
        System.out.println(number);



    }
}

