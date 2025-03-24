package com.wantsome.layered.databases.service;

import com.wantsome.layered.databases.dao.Book;
import com.wantsome.layered.databases.dao.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Transactional
    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

}
