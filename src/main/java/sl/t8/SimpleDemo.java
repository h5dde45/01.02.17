package sl.t8;

import java.util.Arrays;

public class SimpleDemo {
    public static void main(String[] args) {

        Dog db;
        db=Dog.DOG1;
        System.out.println(db);

        switch (db){
            case DOG1:
                System.out.println("DOG1");
                break;
            case DOG2:
                System.out.println("DOG2");
                break;
            case DOG3:
                System.out.println("DOG3");
                break;
                default:
                    System.out.println("it is do not dog");
        }
        Dog[]dogs=Dog.values();
        System.out.println(Arrays.toString(dogs));
        Dog dog=Dog.valueOf("DOG3");
        System.out.println(dog);
        System.out.println(dog.ordinal());
        System.out.println(Dog.DOG2.ordinal());
        System.out.println(Dog.class.getSuperclass());

    }
}
