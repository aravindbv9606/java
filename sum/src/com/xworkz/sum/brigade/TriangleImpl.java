package com.xworkz.sum.brigade;

public class TriangleImpl implements Triangle {

    @Override
    public double area(double base, double height) {
        return (base * height) / 2;
    }
}
