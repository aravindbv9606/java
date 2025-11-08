package com.xworkz.socailmedia.internal;

import com.xworkz.socailmedia.event.Login;
import com.xworkz.socailmedia.event.PhoneNumber;

public class Phone {
    public double num(long min){
        if(min<9234567810l) {

            try {
                throw new PhoneNumber();
            } catch (PhoneNumber phoneNumber) {
                phoneNumber.printStackTrace();
                System.out.println("only 10 digit pin correct");
            }
        }else{
                System.out.println("more than is not correct 10 digit pin");
            }
        return min;
    }
}
