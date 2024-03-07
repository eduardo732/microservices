package com.drcde.productmicroservice.repository;

import com.drcde.productmicroservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
