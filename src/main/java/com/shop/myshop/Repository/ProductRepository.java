package com.shop.myshop.Repository;
import com.shop.myshop.Application.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();
    public void save(Product product) {
        products.add(product);
    }
    public List<Product> findAll() {
        return products;
    }
    public Product findById(String prodid) {
        return products.stream()
                .filter(p -> p.getProdid().equals(prodid))
                .findFirst()
                .orElse(null);
    }
    public Product findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    public List<Product> findByShopId(String shopid) {
        return products.stream()
                .filter(p -> p.getShopid().equals(shopid))
                .collect(Collectors.toList());
    }
    }
