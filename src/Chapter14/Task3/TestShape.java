package Chapter14.Task3;

import java.util.Arrays;
import java.util.List;


/*Exercise 3, page 561
/* Add Rhomboid to Shapes.java. Create a Rhomboid, upcast it to a Shape,
* then downcast it back to a Rhomboid. Try downcasting to a Circle and
* see what happens.'*/

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
        ((Shape)r).draw();
        // inconvertible types:
        // ((Circle)r).draw();
    }
}
