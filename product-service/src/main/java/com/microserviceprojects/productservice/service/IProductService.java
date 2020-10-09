package com.microserviceprojects.productservice.service;

import com.microserviceprojects.productservice.model.Product;

import java.util.List;

public interface IProductService {

    void save(Product product);
    List<Product> getAllProduct();
    Product getProductById(long id);

}
