package src.com.wipropractices.day3.assignment1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task2 {
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        return numbers.stream()
                .filter(isEven.negate())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        System.out.println("Odd numbers are: " + filterOddNumbers(nums));
    }
}
