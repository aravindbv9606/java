package com.xwork.book.Internal;

import com.xwork.book.event.BookId;

public class BookI {
    public int namingForrmate(int id ){
        if(id<5) {


            try {
                throw new BookId();

            } catch (BookId bookId) {
                bookId.printStackTrace();
                System.out.println("less  than 5");
            }
        }else{
            System.err.println(" not coorect id");
            }
        return id;
        }

    }

