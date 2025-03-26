package com.wantsome.layered.databases.controllers;

import com.wantsome.layered.databases.dao_repository_domain.Author;
import com.wantsome.layered.databases.dao_repository_domain.Book;
import com.wantsome.layered.databases.service.BookService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    void init() {
        Book countOfMonteCristo = new Book();
        countOfMonteCristo.setTitle("Count of Monte Cristo");
        countOfMonteCristo.setPrice(100.0);
        countOfMonteCristo.setAuthor(new Author("Alexander Dumas", 60));

        System.out.println("Saving Book..." + countOfMonteCristo);

        bookService.saveBook(countOfMonteCristo);

        Book harryPotter = new Book();
        harryPotter.setTitle("Harry Potter");
        harryPotter.setPrice(50.0);
        harryPotter.setAuthor(new Author("No name", 45));

        System.out.println("Saving Book..." + harryPotter);

        bookService.saveBook(harryPotter);

        Book foundBook = bookService.findById(countOfMonteCristo.getId());
        Book foundBook2 = bookService.findById(harryPotter.getId());

        System.out.println("Found book = " + foundBook);
        System.out.println("Found book2 = " + foundBook2);


        List<Book> books = bookService.findAll();

        for (Book book : books) {
            System.out.println("Found books by findAll() "  + book);
        }
    }
}
