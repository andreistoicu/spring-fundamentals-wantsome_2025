package com.wantsome.layered.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    public List<Product> findProducts(){
        return List.of(
                new Product(1L, "laptop", 100.00, true),
                new Product(2L, "aspirator", 200.00, false),
                new Product(3L, "expressor", 300.00, true)
        );
    };
}
