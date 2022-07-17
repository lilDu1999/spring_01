package com.djj;

import com.djj.service.BookService;
import com.djj.service.impl.BookServiceImpl;

public class App {
    private BookService bookService = new BookServiceImpl();
    public static void main(String[] args) {
         BookService bookService = new BookServiceImpl();
         bookService.save();
    }
}
