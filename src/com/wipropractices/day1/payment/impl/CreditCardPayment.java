package src.com.wipropractices.day1.payment.impl;

import src.com.wipropractices.day1.payment.service.PaymentGateway;

public class CreditCardPayment implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        return false;
    }

    @Override
    public void printReceipt(double amount) {
        PaymentGateway.super.printReceipt(amount);
    }

}
