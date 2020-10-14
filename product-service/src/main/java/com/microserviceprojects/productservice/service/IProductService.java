package com.microserviceprojects.productservice.service;

import com.microserviceprojects.productservice.model.Product;

import java.util.List;

public interface IProductService {

    Product save(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void deleteAll();
    Product updateProduct(Product product);
}
