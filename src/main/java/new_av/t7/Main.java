package new_av.t7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("sdf"));
        users.add(new User("hsdf"));
        users.add(new User("bsdf"));
        users.add(new User("nsdf"));
        users.add(new User("sdmf"));

        for (User user : users) {
            System.out.print(user.getName()+" ");
        }

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        Collections.sort(users, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(users, Comparator.comparing(User::getName));

        System.out.println();
//        for (User user : users) {
//            System.out.print(user.getName()+" ");
//        }
        users.forEach((user) -> System.out.print(user.getName()+" "));

        final String name="sdf";

//        removeUserByName(users,name);
        System.out.println();

        users.forEach((user) -> System.out.print(user.getName()+" "));
        System.out.println("\n**********************");
        System.out.println();

        List<String> list=new ArrayList<>();
        list.add("fvc");
        list.add("utty");
        list.add("okumuj");
        list.add("cfdc");

        list.forEach(s -> System.out.print(s+" "));
        System.out.println();
        list.replaceAll(s -> {
            StringBuilder sb=new StringBuilder(s);
            return sb.reverse().toString();
        });
        list.forEach(s -> System.out.print(s+" "));

        System.out.println();
        list.forEach(System.out::println);
        System.out.println("\n**********************");
        users.add(new User("ljk"));
        users.add(new User("ofgg"));
        users.add(new User("seer"));
        users.add(new User("ewes"));
        users.forEach((user) -> System.out.print(user.getName()+" "));
        System.out.println();

        users.stream()
                .filter(user -> user.getName().contains("s"))
                .sorted(Comparator.comparing(User::getName))
                .limit(4)
                .forEach(user -> System.out.print(user.getName()+" "));

        System.out.println();

    }


//    private static void removeUserByName(List<User> users, String userName) {
//        users.removeIf(user -> user.getName().equals(userName));
//    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
