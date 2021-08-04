package com.project.product.Controller;

import java.util.List;

import com.project.product.Service.ProductService;
import com.project.product.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product")
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    private int saveproduct(@RequestBody Product products) {

    }
}
