package com.microserviceprojects.orderservice.controller;

import com.microserviceprojects.orderservice.entity.Order;
import com.microserviceprojects.orderservice.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @PostMapping(value = "/orders")
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }
}
