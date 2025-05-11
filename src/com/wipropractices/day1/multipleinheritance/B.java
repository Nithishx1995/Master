package src.com.wipropractices.day1.multipleinheritance;

public interface B {
    default void show()
    {
        System.out.println("B show() will be called...");

    }
}
