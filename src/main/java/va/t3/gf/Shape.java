package va.t3.gf;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public Shape() {
        System.out.println("Shape constructor");
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract double area(int i);

    public final Color getColor() {
        return color;
    }
    public void draw(){
        System.out.println("shape");
    }
}
