package com.xwork.book.External;

import com.xwork.book.Internal.*;

public class BookRunner {
    public static void main(String[] args) {
        BookI book = new BookI();
        book.namingForrmate(4);
        BookN  bookN= new BookN();
        bookN.aouther("raja");
        PageNumbers pageNumbers = new PageNumbers();
        pageNumbers.pagenume(0);
        Pageline page = new Pageline();
        page. numberLines(25);
        BookVallide bookVallide = new BookVallide();
        bookVallide.isValid(false);

    }
}
