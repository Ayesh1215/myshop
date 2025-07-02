package com.shop.myshop.controller;
import com.shop.myshop.Application.Shop;
import com.shop.myshop.service.Shopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ShopController {
    @Autowired
    Shopservice service;
    @GetMapping("/shop")
    public List<Shop> getshops(){
        return service.getshops();
    }
    @GetMapping("/shop/{shopid}")
    public Shop getshopid(@PathVariable String shopid){
        return service.getshopsid(shopid);
    }
    @PostMapping("/shop")
    public void addshop(@RequestBody Shop sho){
        service.addshop(sho);
    }
}
