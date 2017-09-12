package new_av.t3.p2;

import java.awt.*;

public abstract class Shape {

    private Color color;

    public Shape() {
        System.out.println("abstract constructor");
    }
    public Shape(Color color) {
        this.color = color;
    }

    public final Color getColor() {
        return color;
    }

    public  void draw(){
        System.out.println("shape");
    }

}
