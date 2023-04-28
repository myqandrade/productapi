package com.myq.productapi.controllers;

import com.myq.productapi.entities.Product;
import com.myq.productapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    @ResponseStatus(OK)
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void create(@RequestBody Product product){
        productRepository.save(product);
    }
}
