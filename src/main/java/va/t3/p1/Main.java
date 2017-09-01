package va.t3.p1;

public class Main {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(3);
        myInteger.getValue();
        System.out.println(myInteger);
        System.out.println(myInteger.hashCode());
        System.out.println(MyInteger.MAX_VALUE);
        Foo foo = new Foo();
        System.out.println(foo);
        System.out.println(Direction.DOUW.name());
        System.out.println(Direction.DOUW.getCode());
        System.out.println(Direction.DOUW.opposite());

//        myInteger.setValue(11);
    }
}

