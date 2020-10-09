package com.microserviceprojects.orderservice.entity;

import org.springframework.data.annotation.Id;

public class Order {

    @Id
    private String id;

    private String name;


}
