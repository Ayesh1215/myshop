package com.shop.myshop.service;
import com.shop.myshop.Application.Product;
import com.shop.myshop.Repository.ProductRepository;
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
    public List<Product> getProductsByShopId(String shopid) {
        return repository.findByShopId(shopid);
    }
        public List<Product> getProducts () {
            return repository.findAll();
        }
        public Product getProductsid (String prodid){
            return repository.findById(prodid);
        }
        public Product getname (String name){
            return repository.findByName(name);
        }
    }