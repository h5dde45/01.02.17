package sl.t31;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

//        Map<String,Integer> map=new HashMap<>();
//        Map<String,Integer> map=new LinkedHashMap<>();
        Map<String,Integer> map=new TreeMap<>();

        map.put("i i",new Integer("34"));
        map.put("p p",new Integer(44));
        map.put("s s",54);

        System.out.println(map);
        System.out.println(map.put("s s",64));
        System.out.println(map);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> entry:set){
            System.out.print(entry.getKey()+",  ");
            System.out.println(entry.getValue());
        }

    }
}
