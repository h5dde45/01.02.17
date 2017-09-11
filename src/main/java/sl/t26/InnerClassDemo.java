package sl.t26;

public class InnerClassDemo {
    public static void main(String[] args) {

        Outer outer=new Outer();
        outer.test();
        outer.test2();
        Outer.Inner inner=new Outer().new Inner();
        inner.display();

    }
}

class Outer {
    int ovar = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {//member inner
        int ivar = 200;

        void display() {
            System.out.println("inner1= " + ovar);
        }
    }

    void test2() {
        for (int i = 0; i < 3; i++) {
            class Inner2 {//local inner in blockCode

                void display2() {
                    System.out.println("inner2= " + ovar);
                }
            }
            Inner2 inner2 = new Inner2();
            inner2.display2();
        }
    }

}
