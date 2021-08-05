package com.project.product.Service;

import java.util.*;

import com.project.product.Repository.ProductRepository;
import com.project.product.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
    //get
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        productRepository.findAll().forEach(product1 -> products.add(product1));
        return products;
    }
    //get id
    public Product getProductById(Long id){
        return productRepository.findById(id).get();
    }
    //post
    public void saveOrUpdate(Product product) {
    productRepository.save(product);
    }
    //delete all
    public void deleteAll(Product product){
        productRepository.deleteAll();
    }
    //delete id
    public void delete(Long id){
        productRepository.deleteById(id);
    }
    //update
    // public void update(Product product , Long productId){
    //     productRepository.save(product);
    // }

}
