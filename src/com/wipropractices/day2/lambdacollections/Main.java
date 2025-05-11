package src.com.wipropractices.day2.lambdacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        List<Integer> result= list.stream()
                .filter(n->n%2!=0)
                .toList();

        System.out.println(result);

    }
}
