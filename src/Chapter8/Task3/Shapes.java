package Chapter8.Task3;

//Exercise 3: (1) Add a new method in the base class of Shapes.java that prints a message,
// but don’t override it in the derived classes. Explain what happens.
// Now override it in one of the derived classes but not the others, and see what happens.
// Finally, override it in all the derived classes.

public class Shapes {
    private static RandomShapesenerator gen = new RandomShapesenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[9];

// Fill up the array with shapes:

        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
// Make polymorphic method calls:

        for(Shape shp : s) shp.report();


    }
}
