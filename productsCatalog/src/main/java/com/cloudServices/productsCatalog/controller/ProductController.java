package com.cloudServices.productsCatalog.controller;

import com.cloudServices.productsCatalog.model.Product;
import com.cloudServices.productsCatalog.repository.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {


    private Repository repository;


    @PostMapping
    public Product createProduct(@RequestBody Product product){

        return repository.save(product);
    }


    @GetMapping(value = "{id}")
    public Optional <Product> findById(@PathVariable Integer id){
        return repository.findById(id);
    }

}
