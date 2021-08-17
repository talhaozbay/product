package com.project.product.controller;

import java.util.List;

import com.project.product.entity.OrderEntity;
import com.project.product.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    //get
    @GetMapping("/order")
    private List<OrderEntity> getAllOrder(){
        return orderService.getAllOrder();
    }
    //get id
    @GetMapping("/order/{orderId}")
    private OrderEntity getProduct(@PathVariable("orderId")Long orderId){
        return orderService.getProductById(orderId);
    }
    
    //post
    @PostMapping("/order")
        private Long saveOrder(@RequestBody OrderEntity orderEntity) {
        orderService.saveOrUpdate(orderEntity);
        return orderEntity.getOrderId();
    }

    //delete all
    @DeleteMapping("/order")
    private void deleteAllOrder(@RequestBody OrderEntity orderEntity){
        orderService.deleteAll(orderEntity);
    }
    //delete id
    @DeleteMapping("/order/{orderId}")
    private void deleteOrder(@PathVariable("orderId") Long orderId){
        orderService.delete(orderId);
    }


    //update
    @PutMapping(value = "/order")
    private OrderEntity updateOrder(@RequestBody OrderEntity orderEntity){
        return orderService.updateOrder(orderEntity);
    }
}
