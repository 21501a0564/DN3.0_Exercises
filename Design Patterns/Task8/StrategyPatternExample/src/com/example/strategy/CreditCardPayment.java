package com.example.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNo;
    private String cardHolderName;

    public CreditCardPayment(String cardNo, String cardHolderName) {
        this.cardNo = cardNo;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid $" + amt + " using Credit Card.");
    }
}
