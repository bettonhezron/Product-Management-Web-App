package com.hezronbett.product.management.respository;

import com.hezronbett.product.management.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
