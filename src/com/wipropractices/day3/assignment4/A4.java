package src.com.wipropractices.day3.assignment4;

import java.util.*;
import java.util.function.*;


public class A4 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 32, 60000),
                new Employee("Bob", 28, 45000),
                new Employee("Charlie", 40, 75000)
        );

        Predicate<Employee> olderThan30 = emp -> emp.getAge() > 30;
        Function<Employee, String> extractName = Employee::getName;
        Consumer<String> printName = System.out::println;

        employees.stream()
                .filter(olderThan30)
                .map(extractName)
                .forEach(printName);
    }
}
