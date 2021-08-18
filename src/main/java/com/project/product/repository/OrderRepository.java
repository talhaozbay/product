package com.project.product.repository;

import com.project.product.entity.OrderEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <OrderEntity , Long > {

}
//repository