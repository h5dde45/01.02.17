package new_av.t3.p2;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape shape2 = null;
        shape.draw();

        if (shape instanceof CharSequence) {
            System.out.println(true);
        }
        System.out.println(PI+sqrt(45));
    }
}
