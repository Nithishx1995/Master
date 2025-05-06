package src.com.streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNos {

    // Method that returns a list of distinct numbers
    public List<Integer> getDistinctNumbers(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        DistinctNos distinctNos = new DistinctNos();
        List<Integer> list = Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 6);
        List<Integer> distinctList = distinctNos.getDistinctNumbers(list);
        System.out.println(distinctList);
    }
}
