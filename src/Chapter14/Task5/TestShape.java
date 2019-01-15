package Chapter14.Task5;

import java.util.Arrays;
import java.util.List;

/*Exercise 5
/* Implement a rotate(Shape) method in Shapes.java, such that it checks
* to see if it is rotating a Circle (and, if so, doesn't perform the
* operation).*/

public class TestShape {

    static boolean rotate(Shape shape) {
        boolean boolValue;

        if (shape instanceof  Circle) boolValue = true;
        else boolValue = false;

        return boolValue;
    }

    public static void main(String[] args) {
                                        // upcasting
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );
                                        // downcasting
        for(Shape shape : shapeList)
            shape.draw();
        for (Shape shape : shapeList)
            System.out.println(rotate(shape));
    }
}
