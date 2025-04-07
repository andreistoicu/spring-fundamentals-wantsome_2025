package com.wantsome.layered.databases.dao_repository_domain;

import com.wantsome.layered.databases.dao_repository_domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookJpaRepository extends JpaRepository<Book, Long> {

    @Modifying
    @Query("UPDATE Book b SET b.author.name=:author, b.author.age=:age, b.price=:price, b.title=:title WHERE b.id=:id")
    void updateBookById(String author, int age, Double price, String title, Long id);
}
