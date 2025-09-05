package src.com.streammethods;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestChar {
    public static void main(String[] args) {

        String str="Transition".toLowerCase();

        Map<Character,Long> ch=str.chars()
                .peek(System.out::println)
                .mapToObj(c->(char)c)
                .peek(System.out::println)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(ch);

    }
}
