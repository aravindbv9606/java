package com.xworkz.wrapper.External;

import com.xworkz.wrapper.briagad.wrapper;
import sun.invoke.util.Wrapper;

public class WrapperRunner {

    public static void main(String[] args) {

        wrapper rapper = new wrapper();

        Integer result = new Integer (rapper.price);
        System.out.println(result);//boxing

        Integer number= rapper.price;
        System.out.println(number);//auto boxing


    }
}
