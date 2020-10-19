package com.microserviceprojects.productservice.controller;

import com.microserviceprojects.productservice.model.Order;
import com.microserviceprojects.productservice.model.Product;
import com.microserviceprojects.productservice.service.IOrderService;
import com.microserviceprojects.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private IOrderService orderService;

    /*
    private List<Product> products = Arrays.asList(
            new Product(1, "product A", "firsth desc."),
            new Product(2, "product B", "second desc."));
     */


    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping(value="/{id}")
    public Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
        /*
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
         */
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping(value="/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }

    @DeleteMapping
    public void deleteAll(){
        productService.deleteAll();
    }

    @PutMapping(value = "/{id}")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @PostMapping(value = "/orders")
    public Order createOrder(Order order) {
        return orderService.save(order);
    }

}
