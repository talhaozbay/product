package com.project.product.service;

import java.util.ArrayList;
import java.util.List;

import com.project.product.entity.OrderEntity;
import com.project.product.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    //get
    public List<OrderEntity> getAllOrder(){
        List<OrderEntity> OrderEntity = new ArrayList<OrderEntity>();
        orderRepository.findAll().forEach(order1 -> OrderEntity.add(order1));
        return OrderEntity;
        
    }
    //get id
    public OrderEntity getProductById(Long id){
        return orderRepository.findById(id).get();
    }
    //post
    public void saveOrUpdate(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }
    //delete all
    public void deleteAll(OrderEntity orderEntity){
        orderRepository.deleteAll();
    }
    //delete id
    public void delete(Long id){
        orderRepository.deleteById(id);
    }
    //update
    public OrderEntity updateOrder(OrderEntity orderEntity){
        return orderRepository.save(orderEntity);
    }

}
