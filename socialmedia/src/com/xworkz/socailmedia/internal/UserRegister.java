
package com.xworkz.socailmedia.internal;

import com.xworkz.socailmedia.event.UserName;

public class UserRegister {
    public String name(String username) {

        if (username.length() >= 5) {
            try {
                throw new UserName();
            } catch (UserName userName) {
                userName.printStackTrace();
                System.out.println("user name correct");
            }
        } else {
            System.out.println("user name is too short");
        }
        return username;
    }
    }