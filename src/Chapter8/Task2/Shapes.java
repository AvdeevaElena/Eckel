package Chapter8.Task2;

//Exercise 2: (1) Add the @Override annotation to the shapes example.

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
