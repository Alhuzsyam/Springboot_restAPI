package com.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.Product;
import com.domain.services.ProductService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productServices;
    
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productServices.create(product);
    }

    @GetMapping
    public Iterable<Product> findall(){
        return productServices.getall();
    }
    @GetMapping("/{id}")
    public Product findone(@PathVariable("id") Long id){
        return productServices.findOne(id);
    }

    @PutMapping
    public Product updatde(@RequestBody Product product){
        return productServices.create(product);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long id){
         productServices.RemoveOne(id);
    }

}
