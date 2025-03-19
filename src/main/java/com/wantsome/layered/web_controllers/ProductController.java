package com.wantsome.layered.web_controllers;

import com.wantsome.layered.domain_dao.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.wantsome.layered.service.ProductService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String products(Model model) {
        model.addAttribute("products", productService.findALl());
        return "products";
    }

    @GetMapping("/productForm")
    public String productForm(Model model) {
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @PostMapping("/submitProduct")
    public String saveProduct(@ModelAttribute Product product, Model model) {
        productService.saveProduct(product);

        model.addAttribute("title", "Products");
        model.addAttribute("products", productService.findALl());
        return "products";
    }

}
