package Chapter10.Task5.OutPackage;


import Chapter10.Task5.*;

public class A {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        
    }
}
