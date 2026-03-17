package com.shopping;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    // Constructor
    public Shop() {
        products = new ArrayList<>();
        loadProducts();
    }

    // Load some products into the shop
    private void loadProducts() {
        products.add(new Product("S001", "Laptop", 899.99, 5));
        products.add(new Product("S002", "Smartphone", 599.99, 10));
        products.add(new Product("SS003", "Headphones", 49.99, 20));
    }

    // Display available products in the shop
    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            product.displayProduct();
        }
    }

    // Find product by ID
    public Product findProduct(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}