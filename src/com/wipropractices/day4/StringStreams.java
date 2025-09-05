package src.com.wipropractices.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringStreams {
    public static void main(String[] args) {
        // 2. Working with Strings
        List<String> names = Arrays.asList("Alice", "Bob", "Christina", "David", "Elizabeth", "Frank");
        List<String> upperSortedNames = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nUppercase Sorted Names:");
        System.out.println(upperSortedNames);

        // Count words with more than 6 characters
        long countGT6 = names.stream()
                .filter(s -> s.length() > 6)
                .count();
        System.out.println("\nWords with More Than 6 Characters: " + countGT6);
        String concatenated = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("\nConcatenated Words:");
        System.out.println(concatenated);
    }

    // Helper method to check for prime numbers
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }
    }

