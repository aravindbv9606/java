package com.xworkz.socailmedia.internal;

import com.xworkz.socailmedia.event.Login;

public class LoginId {
    public   boolean isThere(boolean isCorrect) {

        if (isCorrect == true) {
            try {
                throw new Login();


            } catch (Login login) {
                login.printStackTrace();
            } System.out.println("login is coorect id");
            }else{
                System.out.println("invalid login");
            }
            return isCorrect;
        }
    }
