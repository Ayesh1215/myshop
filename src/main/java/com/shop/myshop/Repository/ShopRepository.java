package com.shop.myshop.Repository;
import com.shop.myshop.Application.Shop;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Repository
public class ShopRepository {
        List<Shop> shops= new ArrayList<>(Arrays.asList(
                new Shop("a12f8a94-6a1d-4568-9d9f-4b95cb90fdb7","Ali","Ahmed","Lahore"),
                new Shop("b12f8a94-6a1d-4568-9d9f-4b95cb90fdb8","Hamza","Ali","Lahore"),
                new Shop("c12f8a94-6a1d-4568-9d9f-4b95cb90fdb9","Shoz","Hamza","Lahore")));
        public List<Shop> findAll() {
            return shops;
        }
    public Optional<Shop> findById(String shopid) {
        return shops.stream()
                .filter(s -> s.getShopid().equals(shopid))
                .findFirst();
    }
    public void save(Shop shop){
        shops.add(shop);
    }
}
