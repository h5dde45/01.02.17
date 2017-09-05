package pa.t10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserRunner {
    public static void main(String[] args) {
//        List<User> users=new ArrayList<>();
//        List<User> users=new LinkedList<>();
        Set<User> users=new HashSet<>();

        users.add(new User("1","first"));
        users.add(new User("2","second"));
        users.add(new User("1","first"));

        for(User user:users){
            System.out.println(user);
            System.out.println(user.getClass());
            System.out.println(Integer.toHexString(user.hashCode()));
            System.out.println(user.getId()+", "+user.getName());
            System.out.println("*********************");
        }

//        System.out.println(users.get(0).equals(users.get(2)));
//        System.out.println(users.get(0)==(users.get(2)));

//        System.out.println(users. ==(users.get(2)));

        Map<String,User> map=new HashMap<>();

        map.put("1",new User("1","first"));
        map.put("2",new User("2","second"));
        map.put("1",new User("1","first"));

        for (Map.Entry<String,User> entry: map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
