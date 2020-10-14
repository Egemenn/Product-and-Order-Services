package com.microserviceprojects.orderservice.service;

import com.microserviceprojects.orderservice.entity.Order;

public interface IOrderService {
    Order save(Order order);
}
