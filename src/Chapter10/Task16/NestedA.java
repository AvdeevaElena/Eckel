package Chapter10.Task16;

//Create a class containing a nested class. In main( ), create an instance of the nested class.

public class NestedA {

    static class nestA{
    }

    public static void main(String[] args) {

        nestA nestA = new nestA();
        NestedA.nestA nestA1 = new NestedA.nestA();

    }
}
