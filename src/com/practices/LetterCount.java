import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LetterCount {
    public static void main(String[] args) {


        String name = new String("NITHISH NAREN");
        StringBuilder sb= new StringBuilder(name);
        sb.append(" is a Rockstar");
        System.out.println(sb);
        String newName= new String(sb);
        System.out.println(newName=newName.replace(" ",""));

        Map<Character, Integer> map= new TreeMap<>();

        for(Character n:newName.toCharArray())
        {
//            map.put(n,map.getOrDefault(n,0)+1);
            map.put(n,map.getOrDefault(n,0)+1);
//            System.out.println(map);
        }
        System.out.println(map);
    }
}
