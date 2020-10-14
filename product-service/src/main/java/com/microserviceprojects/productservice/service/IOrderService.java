package com.microserviceprojects.productservice.service;


import com.microserviceprojects.productservice.model.Order;

public interface IOrderService {
    Order save(Order order);
}
