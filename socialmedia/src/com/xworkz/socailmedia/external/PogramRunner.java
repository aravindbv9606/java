package com.xworkz.socailmedia.external;

import com.xworkz.socailmedia.event.Otp;
import com.xworkz.socailmedia.internal.*;


public class PogramRunner  {
    public static void main(String[] args)  {


       UserRegister userRegister=new UserRegister();
       userRegister.name("aravind");
        Otpinternal otp = new Otpinternal();
        otp.otp(19);
        PasswordCreate passwordCreate=new PasswordCreate();
        passwordCreate.number(11);
        LoginId loginId=new LoginId();
        loginId.isThere(true);
        Phone phone=new Phone();
        phone.num(2098997654l);
    }
}
