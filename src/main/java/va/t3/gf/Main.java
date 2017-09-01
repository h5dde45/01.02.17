package va.t3.gf;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Circle();
        Shape shape2 = null;
        shape.draw();
        System.out.println(shape.area(2));

        if (shape instanceof CharSequence){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
