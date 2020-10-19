package com.microserviceprojects.productservice.service.impl;

import com.microserviceprojects.productservice.congif.RibbonConfiguration;
import com.microserviceprojects.productservice.model.Order;
import com.microserviceprojects.productservice.service.IOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RibbonClient(name = "order-service", configuration = RibbonConfiguration.class)
public class OrderService implements IOrderService {

    private RestTemplate restTemplate = new RestTemplate();

    /*
    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
     */


    @HystrixCommand(fallbackMethod = "userfallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000") })
    public Order save(Order order) {
        return this.restTemplate.postForObject("http://localhost:8080/orders", order, Order.class);
    }
}
