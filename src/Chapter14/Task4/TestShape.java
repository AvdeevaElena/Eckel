package Chapter14.Task4;

//Exercise 4
/* Modify the previous exercise so that it uses instancof to check the
* type before performing the downcast.*/

import java.util.Arrays;
import java.util.List;

public class TestShape {
    public static void main(String[] args) {
        // upcasting
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
        // downcasting
        for(Shape shape : shapeList)
            shape.draw();
        Rhomboid r = new Rhomboid();
        // Upcast:
        Shape s = (Shape)r;
        s.draw();

        if(s instanceof Circle)
            ((Circle)s).draw();
        else if(!(s instanceof Circle))
            System.out.println("(Shape)r is not a Circle");
    }
}
