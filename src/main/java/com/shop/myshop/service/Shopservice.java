package com.shop.myshop.service;
import com.shop.myshop.Application.Shop;
import com.shop.myshop.JpaRepository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Shopservice {
    @Autowired
    ShopRepository repository;
    public List<Shop> getshops() {
        return repository.findAll();
    }
    public Shop getshopsid(String shopid) {
        return repository.findById(shopid)
                .orElse(new Shop());
    }
    public void addshop(Shop shop){
        repository.save(shop);
    }
}
