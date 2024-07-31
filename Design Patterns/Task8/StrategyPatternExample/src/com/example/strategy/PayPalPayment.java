package com.example.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid $" + amt + " using PayPal.");
    }
}
