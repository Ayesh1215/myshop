package com.shop.myshop.Application;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class User {
    private int user_id;
    private String name;
    private String email;
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
    public User(int user_id, String name, String email, long id) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.id = id;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
