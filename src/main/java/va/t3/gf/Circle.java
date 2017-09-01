package va.t3.gf;

import java.awt.*;

import static java.lang.Math.*;

public class Circle extends Shape {

    public Circle() {
        this(Color.BLACK);
    }

    public Circle(Color color) {
        super(color);
    }

    public double area(int i){
        return PI*pow(i,2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle");
    }
}
