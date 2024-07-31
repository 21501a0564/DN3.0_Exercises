package com.example.adapter;

public class StripeGateway {
    public void charge(double amt) {
        System.out.println("Charging $" + amt + " using Stripe.");
    }
}
