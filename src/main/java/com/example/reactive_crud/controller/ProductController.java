package com.example.reactive_crud.controller;

import com.example.reactive_crud.entity.Product;
import com.example.reactive_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public Mono<Product> saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/all")
    public Flux<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Mono<Product> getSingleEntity(@PathVariable Long id){
        return productService.getSingleEntity(id);
    }
}
