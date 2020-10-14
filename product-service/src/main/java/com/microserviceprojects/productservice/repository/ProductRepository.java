package com.microserviceprojects.productservice.repository;

import com.microserviceprojects.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {
}
