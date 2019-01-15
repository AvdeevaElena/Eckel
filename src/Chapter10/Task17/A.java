package Chapter10.Task17;
// Create a class containing an inner class that itself contains an inner class. Repeat this using nested classes.
// Note the names of the .class files produced by the compiler.

public class A {

    static class B{
        static class C{

        }
    }

    public static void main(String[] args) {

        A.B.C abc = new A.B.C();
        B b = new B();

        System.out.println(abc);
        System.out.println(b);
    }
}
