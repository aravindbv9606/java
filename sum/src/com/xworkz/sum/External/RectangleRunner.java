package com.xworkz.sum.External;

import com.xworkz.sum.brigade.Rectangle;
import com.xworkz.sum.brigade.RectangleImpl;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle = new RectangleImpl();
        double result = rectangle.area(10, 5);
        System.out.println("Rectangle Area = " + result);
    }
}
