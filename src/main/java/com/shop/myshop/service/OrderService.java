package com.shop.myshop.service;
import com.shop.myshop.Application.Order;
import com.shop.myshop.Application.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void addProduct(Product product) {
        System.out.println("Product added: " + product.getName());
    }
    public Order getMyOrder() {
        Order order = new Order();
        return order;
    }
}
