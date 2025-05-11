package src.com.wipropractices.day2.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","cherry","date");

        List<String> result= list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);

    }
}
