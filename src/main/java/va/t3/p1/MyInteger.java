package va.t3.p1;

/**
 * MyInteger
 *
 * @author Vasya Pupkin
 * @version 1.1
 */
public class MyInteger {
    public static final int MAX_VALUE = 0x7fffff_ff;
    private final int value;

    /**
     * @param value wrapper primitive value
     */
    public MyInteger(int value) {
        this.value = value;
    }

//    public MyInteger() {
//
//    }

    /**
     * @return wrapper value
     */
    public int getValue() {
        return value;
    }

//    public void setValue(int value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
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

    public  class Bar {
        public void bar() {
            System.out.println(value);
        }
    }
    public Bar newBar(){
        return new Bar();
    }
}

class Foo { // package

}
