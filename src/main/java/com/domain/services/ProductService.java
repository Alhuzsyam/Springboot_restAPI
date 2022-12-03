package com.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.domain.models.entities.Product;
import com.domain.models.repos.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;
    public Product create(Product product){
        return productRepo.save(product);
    }

    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);

        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }
    public Iterable<Product> getall(){
        return productRepo.findAll();
    }

    public void RemoveOne(Long id){ 
        productRepo.deleteById(id);
    }
    
    public List<Product> findByName(String name){
        return productRepo.findContainByName(name);
    }
}
