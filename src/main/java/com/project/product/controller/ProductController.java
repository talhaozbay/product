package com.project.product.controller;

import com.project.product.Repository.ProductRepository;
import com.project.product.entity.Product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
class ProductController {

    private final ProductRepository repository;

    ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products")
    list<Product> all() {
        return repository.findAll();
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product newProduct) {
        return repository.save(newProduct);
    }

}
