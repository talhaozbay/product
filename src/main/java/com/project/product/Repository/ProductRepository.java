package com.project.product.Repository;

import com.project.product.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    void save(Product product, Long productId);

}
