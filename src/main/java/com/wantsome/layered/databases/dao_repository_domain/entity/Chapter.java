package com.wantsome.layered.databases.dao_repository_domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name="chapter_table")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;

    /*@OneToOne(mappedBy="chapter")
    private Book book;*/

    /*@ManyToOne()
    @JoinColumn(name="book_id")
    private Book book;*/
}
