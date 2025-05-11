package src.com.wipropractices.day1.greeting.service;

public interface Greeting {

    default void defaultGreet()
    {
        System.out.println("defaultGreet() will be called...");
    }

    static void staticGreet() {
        System.out.println("staticGreet() will be called...");
    }

}
