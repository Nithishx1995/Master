package src.com.streammethods;

import java.util.Arrays;
import java.util.List;

public class SumSkipOfFive {

    public static void main(String[] args) {
        List<Integer> nos= Arrays.asList(2,3,4,5,6,8,1,4);

        //first 5 nos sum
        int first5Sum=nos.stream()
                .limit(5)
                        .reduce(Integer::sum).orElse(0);

        System.out.println("first5Sum: "+first5Sum);

        //skip 5 and rest sum
        int skip5Sum=nos.stream()
                .skip(5)
                .reduce(0,Integer::sum);

        System.out.println("skip5Sum: "+skip5Sum);


    }
}
