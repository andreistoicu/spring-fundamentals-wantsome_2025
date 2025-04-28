package com.wantsome.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class SecondOptionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    //completam codul nostru pentru a aduce inregistrarile din DB
}
