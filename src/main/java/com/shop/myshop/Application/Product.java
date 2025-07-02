package com.shop.myshop.Application;
public class Product {
    private String prodid;
    private String name;
    private String price;
    private String quantity;
    private String shopid;
    public Product() {
    }
    public Product(String prodid, String name, String price, String shopid, String quantity) {
        this.prodid = prodid;
        this.name = name;
        this.price = price;
        this.shopid = shopid;
        this.quantity = quantity;
    }
    public String getProdid() {
        return prodid;
    }
    public void setProdid(String prodid) {
        this.prodid = prodid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getShopid() {
        return shopid;
    }
    public void setShopid(String shopid) {
        this.shopid = shopid;
    }
}