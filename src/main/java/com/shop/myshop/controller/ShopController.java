package com.shop.myshop.controller;
import com.shop.myshop.Application.Shop;
import com.shop.myshop.service.Shopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ShopController {
    @Autowired
    Shopservice service;
    @GetMapping("/shop")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public List<Shop> getshops(){

        return service.getshops();

    }
    @GetMapping("/shop/{shopid}")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")

    public Shop getshopid(@PathVariable Integer shopid){

        return service.getshopsid(shopid);
    }
    @PostMapping("/shop")
    @PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
    public void addshop(@RequestBody Shop sho){

        service.addshop(sho);
    }
}
