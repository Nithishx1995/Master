package src.com.wipropractices.day3.assignment3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A3 {
    public static void main(String[] args) {
        List<String> names = List.of("nithish", "pooja");

        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addPrefix = name -> "Hello, " + name;

        Function<String, String> chained = toUpperCase.andThen(addPrefix);

        List<String> result = names.stream()
                .map(chained)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
