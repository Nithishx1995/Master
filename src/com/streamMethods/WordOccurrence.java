package src.com.streamMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccurrence {

    public static void main(String[] args) {

        String[] words = {"NITHISH", "Nithish", "Pooja", "POOJA"};

        // Using streams to count occurrences, ignoring case
        Map<String, Long> wordCountMap = Arrays.stream(words)
                // Convert each word to lowercase to make it case-insensitive
                .map(String::toLowerCase)
                // Group by word and count occurrences
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the word count
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}
