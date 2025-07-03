package com.shop.myshop.controller;

import com.shop.myshop.Application.Product;
import org.springframework.beans.factory.annotation.Autowired;
import com.shop.myshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @RequestMapping("/product")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductsById(@PathVariable Integer prodId) {
        return service.getProductsId(prodId);
    }

    @GetMapping("/product/name/{name}")
    public Product getName(@PathVariable String name) {
        return service.getName(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }
}
