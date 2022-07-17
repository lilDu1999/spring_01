package com.djj;

import com.djj.dao.BookDao;
import com.djj.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");

        BookDao bookDao=(BookDao) ctx.getBean("bookDao");

        bookDao.save();

        BookService bookService=(BookService) ctx.getBean("bookService");

        bookService.save();
    }
}
