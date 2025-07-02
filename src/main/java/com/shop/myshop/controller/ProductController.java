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
    public List<Product> getproducts(){
        return service.getProducts();
    }
    @GetMapping("/product/{prodid}")
    public Product getproductsid(@PathVariable String prodid){
        return service.getProductsid(prodid);
    }
    @GetMapping("/product/name/{name}")
    public Product getname(@PathVariable String name){
        return service.getname(name);
    }
    @PostMapping("/product")
    public void addProduct(@RequestBody  Product prod){
        service.addProduct(prod);
    }
}
