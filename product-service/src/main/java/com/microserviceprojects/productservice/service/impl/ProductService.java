package com.microserviceprojects.productservice.service.impl;

import com.microserviceprojects.productservice.model.Product;
import com.microserviceprojects.productservice.repository.ProductRepository;
import com.microserviceprojects.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
       Product savedProduct = productRepository.save(product);
       return savedProduct;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        productRepository.deleteAll();
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }
}
