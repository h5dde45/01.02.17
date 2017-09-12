package new_av.t3.h2;

/**
 * @author foo bar
 * @version 3.4
 */
public class MyInteger {

    private final int value;
    public static final int MAX_VALUE = 0x7f_ff_ff_ff;

    /**
     * @param value int
     */
    public MyInteger(int value) {
        this.value = value;
    }

    /**
     * @return wrapped int
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return
                Integer.toString(value);
//                String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyInteger)) return false;

        MyInteger myInteger = (MyInteger) o;

        return value == myInteger.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

    public class Foo {
        public void foo() {
            System.out.println(value);
        }
    }

    public Foo newFoo(){
        return new Foo();
    }

}
class NewInt{

}

