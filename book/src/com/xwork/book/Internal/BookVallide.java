package com.xwork.book.Internal;

import com.xwork.book.event.BookVallid;

public class BookVallide {
    public boolean isValid(boolean isThers){
        if (isThers==true) {
            try {
                throw new BookVallid();

            } catch (BookVallid bookVallid) {
                bookVallid.printStackTrace();
                System.out.println("vallid");
            }
        }else {
            System.out.println("invallid");
        }
        return isThers;
    }
}
