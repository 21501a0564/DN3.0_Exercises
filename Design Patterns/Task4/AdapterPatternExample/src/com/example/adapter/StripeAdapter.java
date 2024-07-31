package com.example.adapter;

public class StripeAdapter implements PaymentProcessor{
	private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amt) {
        stripeGateway.charge(amt);
    }
}
