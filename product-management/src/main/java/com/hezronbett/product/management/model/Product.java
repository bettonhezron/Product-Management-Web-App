package com.hezronbett.product.management.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Product {

    @Id
    private String id;

    @NotBlank(message = "Product name is mandatory")
    private String name;

    private String description;
    private double price;
}