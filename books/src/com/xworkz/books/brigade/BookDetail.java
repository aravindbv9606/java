package com.xworkz.books.brigade;

import com.xworkz.books.Internal.*;


public interface BookDetail {
    BookCategory category(BookCategory bookCategory);
    boolean details(BookDetails bookDetails);
    BookInfo info(BookInfo bookInfo);
    boolean store(BookStore bookStore);
    BookSales sales(BookSales bookSales);

    BookCategory category(BookCategory name);
}
