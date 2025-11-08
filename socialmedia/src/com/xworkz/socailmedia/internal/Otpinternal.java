package com.xworkz.socailmedia.internal;

import com.xworkz.socailmedia.event.Otp;

public class Otpinternal {

    public int otp(int valid) {
        if (valid < 18) {
            try {
                throw new Otp();
            } catch (Otp otp) {
               System.out.println("Exception caught otp ");
            }
        } else {
            System.out.println("invalid OTP");
        }

        return valid;
    }
}


