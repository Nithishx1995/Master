package src.com.wipropractices.day1.payment;

import src.com.wipropractices.day1.payment.impl.CreditCardPayment;
import src.com.wipropractices.day1.payment.impl.PayPalPayment;
import src.com.wipropractices.day1.payment.service.PaymentGateway;

public class Payment extends PayPalPayment {

    public static void main(String[] args) {

        CreditCardPayment cp= new CreditCardPayment();
        cp.processPayment(10000);
        cp.printReceipt(20000);

        PaymentGateway pg= new PayPalPayment();
        PaymentGateway.getSupportedCurrencies();
        PaymentGateway.logTransaction(15000,"Success");
    }


}

