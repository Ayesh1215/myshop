package com.shop.myshop.service;
import com.shop.myshop.Application.Product;
import com.shop.myshop.Application.Shop;
import com.shop.myshop.JpaRepository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Shopservice {
    @Autowired
    ShopRepository repository;
    public Shop createShopWithProducts(Shop shop, List<Product> products) {
        shop.setProducts(products);
        for (Product product : products) {
            product.setShop(shop);
        }
        return repository.save(shop);
    }
    public List<Shop> getshops() {
        return repository.findAll();
    }
    public Shop getshopsid(Integer id) {
        return repository.findById(id).orElse(null);
    }
    public void addshop(Shop shop){
        repository.save(shop);
    }
    }

