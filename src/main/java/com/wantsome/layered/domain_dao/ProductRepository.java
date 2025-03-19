package com.wantsome.layered.domain_dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;
    private long idCount =1L;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    public List<Product> findProducts(){
        return List.of(
                new Product(1L, "laptop", 100.00, true),
                new Product(2L, "aspirator", 200.00, false),
                new Product(3L, "expressor", 300.00, true)
        );
    }

    public List<Product> findALl(){
        return products;
    }

    public void save(Product product) {
        product.setId(idCount++);
        System.out.println("Product saved " + product);

        products.add(product);
    }

}
