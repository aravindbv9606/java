package com.xworkz.socailmedia.internal;

import com.xworkz.socailmedia.event.Password;

public class PasswordCreate {
    public int number (int values){
        if (values < 10){
            try{
                throw new Password();
                }catch (Password password){
                password.printStackTrace();


                System.out.println("password is less than 10 is coorect");
            }
            }else{
                System.out.println("password is more than 10 is not coorect");
            }
        return values;
    }

}
