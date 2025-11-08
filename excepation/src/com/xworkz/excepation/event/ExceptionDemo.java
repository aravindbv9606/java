package com.xworkz.excepation.event;

public class ExceptionDemo {

    public void comileTimeException() throws ArithmeticException {
        System.out.println("Arithmetic Exception");
        throw new ArithmeticException("Division by zero error");
    }

    public void comileTimeException2() throws NullPointerException {
        System.out.println("Null Pointer Exception");
        throw new NullPointerException();
    }

    public void arrayIndexException() throws ArrayIndexOutOfBoundsException {
        System.out.println("Array Index Out Of Bounds Exception");
        throw new ArrayIndexOutOfBoundsException("Invalid array index");
    }

    public void numberFormatException() throws NumberFormatException {
        System.out.println("Number Format Exception");
        throw new NumberFormatException("Invalid number format");
    }

    public void classCastException() throws ClassCastException {
        System.out.println("Class Cast Exception");
        throw new ClassCastException("Invalid type casting");
    }

    public void illegalArgument() throws IllegalArgumentException {
        System.out.println("Illegal Argument Exception");
        throw new IllegalArgumentException("Illegal argument passed");
    }

    public void negativeArraySize() throws NegativeArraySizeException {
        System.out.println("Negative Array Size Exception");
        throw new NegativeArraySizeException("Array size cannot be negative");
    }

    public void securityException() throws SecurityException {
        System.out.println("Security Exception");
        throw new SecurityException("Security violation");
    }

    public void unsupportedOperation() throws UnsupportedOperationException {
        System.out.println("Unsupported Operation Exception");
        throw new UnsupportedOperationException("Operation not supported");
    }

    public void illegalState() throws IllegalStateException {
        System.out.println("Illegal State Exception");
        throw new IllegalStateException("Illegal state occurred");
    }

}