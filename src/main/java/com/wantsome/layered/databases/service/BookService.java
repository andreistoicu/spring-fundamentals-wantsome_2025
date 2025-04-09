package com.wantsome.layered.databases.service;

import com.wantsome.layered.databases.dao_repository_domain.BookJpaRepository;
import com.wantsome.layered.databases.dao_repository_domain.entity.Book;
import com.wantsome.layered.databases.dao_repository_domain.BookRepository;
import com.wantsome.layered.databases.exception.AnotherException;
import com.wantsome.layered.databases.exception.NoBookFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    BookRepository bookRepository;

    BookJpaRepository bookJpaRepository;

    public BookService(BookRepository bookRepository, BookJpaRepository bookJpaRepository) {
        this.bookRepository = bookRepository;
        this.bookJpaRepository = bookJpaRepository;
    }

    @Transactional
    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();

        //mai multe operatiuni
    }

    @Transactional
    public void deleteById(Long id) {
        bookJpaRepository.findById(id)
                .orElseThrow(() -> new AnotherException("No book having the id: " + id + " was found to be deleted!"));

        bookJpaRepository.deleteById(id);
    }

    @Transactional
    public void updateBookById(Long id, Book book) {
        bookJpaRepository.findById(id)
                .orElseThrow(() -> new NoBookFoundException("No book found with the id: " + id));

        bookJpaRepository.updateBookById(
                book.getAuthor().getName(),
                book.getAuthor().getAge(),
                book.getPrice(),
                book.getTitle(),
                id
        );
    }

}
