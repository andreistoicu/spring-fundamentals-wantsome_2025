package com.wantsome.layered.databases.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Customer customer) {
        //entityManager.persist(customer);
    }

    public Customer findById(Long id) {
        //return entityManager.find(Customer.class, id);
    }
}
