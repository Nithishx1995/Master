package src.com.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonNumericChars {

    public static void main(String[] args) {
        List<String> str= Arrays.asList("a","1","2","b");
        String regex="[a-zA-Z]";

        Map<Boolean,List<String>> result=str.stream()
                .map(String::toLowerCase)
                .collect(Collectors.partitioningBy(n->!n.matches(regex)));

        System.out.println("Numbers: "+result.get(true));
        System.out.println("String: "+result.get(false));

    }
}
