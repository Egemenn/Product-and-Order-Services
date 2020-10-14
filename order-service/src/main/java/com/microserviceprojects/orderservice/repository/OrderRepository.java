package com.microserviceprojects.orderservice.repository;

import com.microserviceprojects.orderservice.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
