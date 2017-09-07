package sl.l1;

public class Varargs {
    public static void main(String[] args) {
        fly(1, 2, 3);
        fly("New message", 1, 2, 3);
        fly(new int[]{1, 2, 3, 4, 5});//redundant
        fly();
    }

    private static void fly(int... ints) {
        System.out.println(ints.length);
    }
//    private static void fly(int i,int... ints) {
//        System.out.println(ints.length);
//    }


    private static void fly(String s, int... ints) {
        System.out.println(ints.length);
    }

//    private static void fly( int... ints,String... s) {
//        System.out.println(ints.length);
//    }
//    private static void fly( int... ints,String s) {
//        System.out.println(ints.length);
//    }
//    private static void fly(boolean... s) {
//        System.out.println(s.length);
//    }

}
