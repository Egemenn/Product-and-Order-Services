package com.microserviceprojects.productservice.controller;

import com.microserviceprojects.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductController {

    private List<Product> products = Arrays.asList(
            new Product(1, "product A", "firsth desc."),
            new Product(2, "product B", "second desc."));

    @GetMapping
    public List<Product> getAllProducts(){
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable long id){
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
