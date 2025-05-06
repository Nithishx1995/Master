package src.com.streammethods;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurrence {

    public static void main(String[] args) {

        String[] words = {"NITHISH", "Nithish", "Pooja", "POOJA"};

        // Using streams to count occurrences, ignoring case
        Map<String, Long> wordCountMap = Arrays.stream(words)
                // Convert each word to lowercase to make it case-insensitive
                .map(String::toLowerCase)
                // Group by word and count occurrences
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        // Print the word count
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }

}
