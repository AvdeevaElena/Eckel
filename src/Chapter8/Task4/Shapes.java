package Chapter8.Task4;

//Exercise 4: (2) Add a new type of Shape to Shapes.java and verify in main( )
// that polymorphism works for your new type as it does in the old types

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
