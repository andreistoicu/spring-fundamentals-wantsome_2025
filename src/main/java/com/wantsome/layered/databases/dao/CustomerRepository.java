package com.wantsome.layered.databases.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Customer customer) {
        if (customer.getId() == null) {
            entityManager.persist(customer); // echivalent cu Save/Insert
        } else {
            entityManager.merge(customer); //echivalent cu Update
        }
    }

    public Customer findById(Long id) {
        return entityManager.find(Customer.class, id);
    }

    public List<Customer> findAll() {
        return entityManager.createQuery
                ("SELECT c FROM Customer c", Customer.class)
                .getResultList();
    }
}
