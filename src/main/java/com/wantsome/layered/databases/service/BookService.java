package com.wantsome.layered.databases.service;

import com.wantsome.layered.databases.dao_repository_domain.BookJpaRepository;
import com.wantsome.layered.databases.dao_repository_domain.entity.Book;
import com.wantsome.layered.databases.dao_repository_domain.BookRepository;
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

    public void deleteById(Long id) {
        bookJpaRepository.deleteById(id);
    }

    @Transactional
    public void updateBookById(Long id, Book book) {
        bookJpaRepository.updateBookById(
                book.getAuthor().getName(),
                book.getAuthor().getAge(),
                book.getPrice(),
                book.getTitle(),
                id
        );
    }

}
