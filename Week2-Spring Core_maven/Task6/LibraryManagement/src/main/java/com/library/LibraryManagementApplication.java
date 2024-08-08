package com.library;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.library")) {
            BookService bookService = context.getBean(BookService.class);
            bookService.addBook("Spring in Action");
        }
    }
}
