package com.shop.myshop.service;
import com.shop.myshop.Application.Shop;
import com.shop.myshop.Repository.ShopRepository;
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
              .orElse(new Shop("d12f8a94-6a1d-4568-9d9f-4b95cb90fdb9", "no_name", "no_name", "no_address"));
    }
    public void addshop(Shop shop){
        repository.save(shop);
    }
}
