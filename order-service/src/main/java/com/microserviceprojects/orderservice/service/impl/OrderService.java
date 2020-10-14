package com.microserviceprojects.orderservice.service.impl;

import com.microserviceprojects.orderservice.entity.Order;
import com.microserviceprojects.orderservice.repository.OrderRepository;
import com.microserviceprojects.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        Order savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}
