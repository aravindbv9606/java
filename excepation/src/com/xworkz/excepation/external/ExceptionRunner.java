package com.xworkz.excepation.external;

import com.xworkz.excepation.event.ExceptionDemo;

public class ExceptionRunner {

    public static void main(String[] args) throws ArithmeticException,NullPointerException, ArrayIndexOutOfBoundsException,NumberFormatException,ClassCastException,IllegalArgumentException,NegativeArraySizeException,SecurityException,UnsupportedOperationException,IllegalStateException {

        ExceptionDemo demo = new ExceptionDemo();

        demo.comileTimeException();
        demo.comileTimeException2();
        demo.arrayIndexException();
        demo.numberFormatException();
        demo.classCastException();
        demo.illegalArgument();
        demo.negativeArraySize();
        demo.securityException();
        demo.unsupportedOperation();
        demo.illegalState();

    }
}