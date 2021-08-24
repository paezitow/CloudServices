package com.cloudServices.productsCatalog.repository;

import com.cloudServices.productsCatalog.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface Repository extends CrudRepository<Product, Integer> {
}
