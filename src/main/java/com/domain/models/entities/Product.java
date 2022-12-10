package com.domain.models.entities;

import java.io.Serializable;

import org.apache.logging.log4j.message.Message;
import org.springframework.validation.annotation.Validated;

import io.micrometer.common.lang.NonNull;

// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

// import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_product")
public class Product implements Serializable {
    // public Product(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name", nullable = false)
    @NotEmpty(message="name is required")
    private String name;
    
    // @Column(name = "product_description",length = 250)
    @Column(name = "product_description", nullable = false)
    @NotEmpty(message="description is required")
    private String description;

    // @NotEmpty(message="price is required")
    private Double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
}
