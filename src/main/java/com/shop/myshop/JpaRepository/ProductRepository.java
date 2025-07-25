package com.shop.myshop.JpaRepository;

import com.shop.myshop.Application.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
    Optional<Product> findById(Integer id);
}
