package com.example.reactive_crud.repository;

import com.example.reactive_crud.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {

}
