package com.wantsome.layered.service;

import org.springframework.stereotype.Service;
import com.wantsome.layered.domain_dao.Product;
import com.wantsome.layered.domain_dao.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findProducts(){
        return productRepository.findProducts();
    }
}
