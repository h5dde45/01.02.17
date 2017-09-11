package sl.t33;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> set=new HashSet<>();
//        Set<String> set=new LinkedHashSet<>();
        Set<String> set=new TreeSet<>();

        set.add("csf");
        set.add("btg");
        set.add("ajh");

        System.out.println(set);
        System.out.println(set.add("ajh"));
        System.out.println(set.contains("csf"));
        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
