import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String name="Technical rouand of Nithish";

        name=name.replace(" ","");
        System.out.println(name);

        Map<Character,Integer> map=new HashMap<>();


        for (Character ch:name.toLowerCase().toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);

        }

//        for(Character c:map.keySet())
//        {
//           StringBuilder sb = new StringBuilder();
//        }

//        for(Character c: map.keySet())
//        {
//            if(map.keySet().stream().mapToInt())
//            {
//                System.out.println(c+" "+map.get(c));
//            }
//            else
//                System.out.println("No Repeated values!");
//        }



    }

}
