package com.xwork.book.Internal;

import com.xwork.book.event.Pages;

public class PageNumbers {
    public long pagenume(long order){
        if (order==0){
            try {
                throw new Pages();

            }catch (Pages pages){
                pages.printStackTrace();
                System.out.println("order pages series");
            }

        }else {
            System.out.println(" midel numbers nonorder  pages series");
        }

        return order;
    }
}
