package src.com.wipropractices.day3.assignment1;

import java.util.*;
import java.util.function.Consumer;

public class Task3 {
    public static void printAll(List<String> items) {
        Consumer<String> printer = System.out::println;
        items.forEach(printer);
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        System.out.println(names);
    }
}

