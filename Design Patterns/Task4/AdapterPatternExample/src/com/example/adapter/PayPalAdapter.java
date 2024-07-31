package com.example.adapter;

public class PayPalAdapter implements PaymentProcessor{
	private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amt) {
        payPalGateway.makePayment(amt);
    }
}
