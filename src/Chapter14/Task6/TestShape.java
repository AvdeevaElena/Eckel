package Chapter14.Task6;

import java.util.Arrays;
import java.util.List;

/* Exercise 6
/* Modify Shapes.java so that it can "highlight" (set a flag in)
* all shapes of a particular type.  The toString() method for each
* derived Shape should indicate whether that Shape is "highlighted."*/

public class TestShape {

   static void setFlag(Shape shape) {
        if (shape instanceof Square)
            ((Square)shape).flag = true;
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
            setFlag(shape);
        for (Shape shape : shapeList)
            System.out.println(shape.toString());
    }
}
