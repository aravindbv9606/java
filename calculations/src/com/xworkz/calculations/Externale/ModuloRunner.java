package com.xworkz.calculations.Externale;

import com.xworkz.calculations.briagade.ModuloOperation;

public class ModuloRunner {
    public static void main(String[] args) {
        ModuloOperation mod = (a, b) -> a % b;
        System.out.println("Modulo: " + mod.compute(10, 5));
    }
}
