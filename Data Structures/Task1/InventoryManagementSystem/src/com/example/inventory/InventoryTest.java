package com.example.inventory;

public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("P001", "Product 1", 100, 10.0);
        Product product2 = new Product("P002", "Product 2", 200, 20.0);
        
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        
        System.out.println("Added Products:");
        System.out.println(inventory.getProduct("P001").getProductName());
        System.out.println(inventory.getProduct("P002").getProductName());
        
        Product updatedProduct1 = new Product("P001", "Updated Product 1", 150, 15.0);
        
        inventory.updateProduct(updatedProduct1);
        
        System.out.println("Updated Product:");
        System.out.println(inventory.getProduct("P001").getProductName() + " - " + inventory.getProduct("P001").getQuantity());
        
        inventory.deleteProduct("P002");
        
        System.out.println("Deleted Product P002.Trying to access it:");
        System.out.println(inventory.getProduct("P002"));
    }
}
