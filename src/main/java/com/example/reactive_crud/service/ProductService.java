package com.example.reactive_crud.service;

import com.example.reactive_crud.entity.Product;
import com.example.reactive_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Mono<Product> saveProduct(Product product) {
        Product createProduct = new Product();
        createProduct.setName(product.getName());
        createProduct.setPrice(product.getPrice());
        return productRepository.save(createProduct);
    }

    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Mono<Product> getSingleEntity(Long id){
        return productRepository.findById(id);
    }
}
