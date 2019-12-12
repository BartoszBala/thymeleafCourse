package com.example.demothymeleaf.services;

import com.example.demothymeleaf.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);
    List<Product> listProduct();
}
