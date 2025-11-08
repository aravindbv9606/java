package com.xwork.book.Internal;

import com.xwork.book.event.Pagelines;

public class Pageline {
    public float numberLines(float totalLines){
        if(totalLines<25){
            try{
                throw new Pagelines();
            }catch(Pagelines  pagelines){
                pagelines.printStackTrace();
                System.out.println("pagelines only 25 lines one page");

            }

        }else {
            System.out.println("  this page is more than  25 lines in the page");
        }

        return totalLines;
    }
}
