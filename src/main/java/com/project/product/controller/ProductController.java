package com.project.product.Controller;

import java.util.List;

import com.project.product.Service.ProductService;
import com.project.product.entity.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    //get
    @GetMapping("/product")
    private List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    //get id
    @GetMapping("/product/{productId}")
    private Product getProduct(@PathVariable("productId")Long productId){
        return productService.getProductById(productId);
    }
    //post
    @PostMapping("/product")
    private Long saveproduct(@RequestBody Product product) {
    productService.saveOrUpdate(product);
    return product.getProductId();
    }
    //delete all
    @DeleteMapping("/product")
    private void deleteAllProduct(@RequestBody Product product){
        productService.deleteAll(product);
    }
    //delete id
    @DeleteMapping("/product/{productId}")
    private void deleteProduct(@PathVariable("productId") Long productId){
        productService.delete(productId);
    }
    //update
    @PutMapping(value = "/product")
    private Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }


}
