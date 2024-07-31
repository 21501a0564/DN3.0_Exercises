package com.example.ecommerce;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Keyboard", "Accessories")
        };

        // Testing linear search
        System.out.println("Testing Linear Search:");
        Product result = Search.linearSearch(products, "Tablet");
        if (result != null) {
            System.out.println("Product found: " + result.getProductName() + ", ID: " + result.getProductId() + ", Category: " + result.getCategory());
        } else {
            System.out.println("Product not found.");
        }

        // Testing binary search
        System.out.println("\nTesting Binary Search:");
        result = Search.binarySearch(products, "Tablet");
        if (result != null) {
            System.out.println("Product found: " + result.getProductName() + ", ID: " + result.getProductId() + ", Category: " + result.getCategory());
        } else {
            System.out.println("Product not found.");
        }
    }
}
