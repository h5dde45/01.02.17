package new_av.t3.p2;

import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        this(Color.BLACK);
    }

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle");
    }

}
