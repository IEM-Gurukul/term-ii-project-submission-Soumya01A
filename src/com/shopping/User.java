package com.shopping;

public class User {
    private String name;
    private Cart cart;

    // Constructor
    public User(String name) {
        this.name = name;
        this.cart = new Cart();
    }

    // Getters
    public String getName() { return name; }
    public Cart getCart() { return cart; }
}
