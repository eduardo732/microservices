package com.drcde.productmicroservice.controller;

import com.drcde.productmicroservice.entity.Product;
import com.drcde.productmicroservice.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  private ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Product> getAllProducts() {
    return this.productRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void createProduct(@RequestBody Product product) {
    this.productRepository.save(product);
  }
}
