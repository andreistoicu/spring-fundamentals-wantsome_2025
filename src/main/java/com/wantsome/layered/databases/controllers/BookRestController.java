package com.wantsome.layered.databases.controllers;

import com.wantsome.layered.databases.dao_repository_domain.entity.Book;
import com.wantsome.layered.databases.exception.NoUseException;
import com.wantsome.layered.databases.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookRestController {

    private BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.findAll();

        if(books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        Book book = bookService.findById(id);
        //throw new RuntimeException("Not implemented yet");

        if(book == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("")
    //@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long id, @RequestBody Book book) {

        if(id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else if(id == 300) {
            throw new RuntimeException("global exception");
        } else if(id == 400) {
            throw new NoUseException("no use exception");
        }

        bookService.updateBookById(id, book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
