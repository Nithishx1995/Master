package src.com.wipropractices.day3.assignment1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry");
        Function<String, Integer> lengthFunction = String::length;

        List<Integer> lengths = words.stream()
                .map(lengthFunction)
                .collect(Collectors.toList());

        System.out.println("Lengths: " + lengths);
    }
}
