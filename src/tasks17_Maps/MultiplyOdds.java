package tasks17_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {

    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();

        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);

        System.out.println(map);

        Iterator<Map.Entry<Character,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Character,Integer> entry = itr.next();
            Character key =entry.getKey();
            Integer value = entry.getValue();
            if (value % 2 == 1){
                map.put(key , value * 2 );
            }
        }

        System.out.println(map);







    }
}
