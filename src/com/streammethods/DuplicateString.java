package src.com.streammethods;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateString {

    public static void main(String[] args) {
        String str="Transition".toLowerCase();

        Map<Character,Long> map=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<Character> result=map.entrySet().stream()
                .filter(n->n.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);


    }
}
