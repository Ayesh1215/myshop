package com.shop.myshop.Application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private String owner;
    private String address;
    public Shop() {
    }
    public Shop(String id, String name, String owner, String address) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.address = address;
    }
    public String getid() {
        return id;
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
    public void setid(String shopid) {
        this.id = shopid;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
