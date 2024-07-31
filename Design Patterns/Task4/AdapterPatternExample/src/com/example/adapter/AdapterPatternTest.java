package com.example.adapter;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create PayPal gateway and its adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);

        // Create Stripe gateway and its adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Use adapters to process payments
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
