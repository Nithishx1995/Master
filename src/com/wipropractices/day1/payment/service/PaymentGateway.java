package src.com.wipropractices.day1.payment.service;

public interface PaymentGateway {

    boolean processPayment(double amount);

    default void printReceipt(double amount) {
        System.out.println("printReceipt() will be called...");
    }

    static void logTransaction(double amoubnt, String status) {
        System.out.println("logTransaction() will be called...");
    }

    default boolean validatePayment() {

        System.out.println("validatePayment() will be called...");

        return false;
    }

    static void getSupportedCurrencies() {
        System.out.println("getSupportedCurrencies() will be called...");
    }

}
