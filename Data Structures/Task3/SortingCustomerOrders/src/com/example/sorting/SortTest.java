package com.example.sorting;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "Diana", 200.0),
            new Order("O005", "Eve", 100.0)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Test Bubble Sort
        BubbleSort.sortOrders(orders);
        System.out.println("\nOrders after Bubble Sort:");
        printOrders(orders);

        // Resetting orders for quick sort
        orders = new Order[]{
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "Diana", 200.0),
            new Order("O005", "Eve", 100.0)
        };

        // Test Quick Sort
        QuickSort.sortOrders(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        Arrays.stream(orders).forEach(System.out::println);
    }
}
