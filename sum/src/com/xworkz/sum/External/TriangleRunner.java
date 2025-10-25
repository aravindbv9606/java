package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Triangle;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = (base, height) -> (base * height) / 2;

        double result = triangle.area(10, 5);
        System.out.println("Triangle Area = " + result);
    }
}
