package com.xwork.book.Internal;

import com.xwork.book.event.BookName;

public class BookN {
    public String aouther(String name){
        if (name==null ){
           try {
               throw new BookName();

           }catch (BookName bookName){
               bookName.printStackTrace();
               System.out.println("coorect aouther name");
           }
        }else {
            System.out.println("not correct aouther");
        }
        return name;
    }
}
