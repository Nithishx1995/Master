import java.util.*;
import java.util.stream.Collectors;

public class FruitsDisplay {

    public static void main(String[] args) {
        //input fruits
        List<String> fruits= Arrays.asList("apple", "avocado", "banana", "blueberry", "cherry");

        Map<Character, List<String>> result = fruits.stream()
                .collect(Collectors.groupingBy((newFruits)->newFruits.charAt(0)));

        System.out.println(result);







    }


}
