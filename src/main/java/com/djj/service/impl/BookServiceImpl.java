package com.djj.service.impl;

import com.djj.dao.BookDao;
import com.djj.dao.impl.BookDaoImpl;
import com.djj.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
}
