package src.com.wipropractices.day2.customcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> p= Arrays.asList( new Person(21,"Nithish"),new Person(24,"Pooja"));

        List<String> result=p.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .toList();

        System.out.println(result);
    }
}
