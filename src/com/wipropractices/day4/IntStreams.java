package src.com.wipropractices.day4;

import java.util.*;
import java.util.stream.*;

public class IntStreams {

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }


    public static void main(String[] args) {
        Random random = new Random();

        // 1. Generate a list of 50 random numbers between 1 and 1000
        List<Integer> numbers = random.ints(50, 1, 1001)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Original List:");
        System.out.println(numbers);

        // Find and print all prime numbers
        List<Integer> primes = numbers.stream()
                .filter(IntStreams::isPrime)
                .collect(Collectors.toList());
        System.out.println("\nPrime Numbers:");
        System.out.println(primes);

        // Find the sum of all even numbers using reduce()
        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("\nSum of Even Numbers: " + sumEven);

        // Find the top 5 largest numbers using sorted().limit(5)
        List<Integer> top5Largest = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("\nTop 5 Largest Numbers:");
        System.out.println(top5Largest);

        // Find the smallest number greater than 500 using findFirst()
        Optional<Integer> smallestGT500 = numbers.stream()
                .filter(n -> n > 500)
                .sorted()
                .findFirst();
        System.out.println("\nSmallest Number > 500: " +
                smallestGT500.orElse(null));

        // Filter even numbers using stream().filter()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("\nEven Numbers:");
        System.out.println(evenNumbers);

        // Modify to filter numbers greater than 10
        List<Integer> greaterThan10 = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        System.out.println("\nNumbers Greater Than 10:");
        System.out.println(greaterThan10);

        // Sum of all elements using stream().reduce()... Modify to find product of all elements

        List<Integer> newNumbers = Arrays.asList(5, 8, 13, 21, 34, 3, 10, 50, 2, 99, 18);
        List<Integer> newEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);
        List<Integer> greaterThanTen = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println("Numbers Greater Than 10:");
        System.out.println(greaterThanTen);

    }
}


