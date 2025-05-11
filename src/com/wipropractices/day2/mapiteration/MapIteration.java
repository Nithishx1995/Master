package src.com.wipropractices.day2.mapiteration;

import src.com.wipropractices.day2.customcomparator.Person;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String,Integer> map= Map.of("Apple",100,"Banana",80,"Cherry",120);
        map.forEach((k,v)->{
            System.out.println(k+":"+v);

        });

//       for (Map.Entry<String,Integer> me: map.entrySet())
//        {
//
//        }
    }
}
