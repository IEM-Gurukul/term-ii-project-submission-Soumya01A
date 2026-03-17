package com.shopping;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    // Constructor
    public Cart() {
        products = new ArrayList<>();
    }

    // Add product to cart with quantity
    public void addProduct(Product product, int quantity) {
        boolean found = false;

        // Check if the product is already in the cart
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                p.setQuantity(p.getQuantity() + quantity);  // Increase quantity if already present
                found = true;
                System.out.println(quantity + " " + product.getName() + "(s) added to your cart. New quantity: " + p.getQuantity());
                break;
            }
        }

        // If product is not in the cart, add it with the specified quantity
        if (!found) {
            product.setQuantity(quantity);
            products.add(product);
            System.out.println(quantity + " " + product.getName() + "(s) added to your cart.");
        }
    }

    // Remove product from cart with quantity
    public void removeProduct(String productId, int quantity) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                if (product.getQuantity() > quantity) {
                    product.setQuantity(product.getQuantity() - quantity);
                    System.out.println(quantity + " " + product.getName() + "(s) removed from your cart. Remaining quantity: " + product.getQuantity());
                } else {
                    products.remove(product);  // Remove product entirely if quantity is 0 or less
                    System.out.println(product.getName() + " removed from your cart.");
                }
                break;
            }
        }
    }

    // Display all products in the cart
    public void displayCart() {
        System.out.println("Cart Items:");
        for (Product product : products) {
            product.displayProduct();
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }
}