package com.hezronbett.product.management.controller;

import com.hezronbett.product.management.model.Product;
import com.hezronbett.product.management.service.ProductService;
import jakarta.validation.Valid;
//import org.springframework.security.core.parameters.P;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createProduct(@Valid @RequestBody Product product) {
        return productService.saveProduct(product);
    }

}

