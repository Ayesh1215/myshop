package com.shop.myshop.service;

import com.shop.myshop.Application.Product;
import com.shop.myshop.JpaRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public void addProduct(Product product) {
        repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductsId(Integer prodId) {
        return repository.findById(prodId).orElse(null);
    }

    public Product getName(String name) {
        return repository.findByName(name);
    }
}
