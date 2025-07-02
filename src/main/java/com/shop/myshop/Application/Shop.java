package com.shop.myshop.Application;
public class Shop {
    private String shopid;
    private String name;
    private String owner;
    private String address;
    public Shop() {
    }
    public Shop(String shopid, String name, String owner, String address) {
        this.shopid = shopid;
        this.name = name;
        this.owner = owner;
        this.address = address;
    }
    public String getShopid() {
        return shopid;
    }
    public String getOwner() {
        return owner;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setShopid(String shopid) {
        this.shopid = shopid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public String toString() {
        return "Shop{" +
                "shopid='" + shopid + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
