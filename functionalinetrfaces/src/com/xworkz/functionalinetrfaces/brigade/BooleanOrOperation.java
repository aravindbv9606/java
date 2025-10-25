package com.xworkz.functionalinetrfaces.brigade;

@FunctionalInterface
public interface BooleanOrOperation {
    boolean compute(boolean a, boolean b);
}
