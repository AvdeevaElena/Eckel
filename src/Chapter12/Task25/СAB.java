package Chapter12.Task25;

/*Exceptions, Exercise 25
/* Create a three-level hierarchy of exceptions. Now create a
* base-class A with a method that throws an exception at the base
* of your hierarchy. Inherit B from A and override the method so
* it throws an exception at level two of your hierarchy. Repeat by
* inheriting class C from B. In main(), create a C and upcast it
* to A, then call the method.*/

public class СAB extends B {

    void globalMethod () throws MyExseption_level3 {
        System.out.println(" in    class C () ");
        throw new MyExseption_level3();
    }

    public static void main(String[] args) {
        System.out.println("UPCASTING");
        A a = new СAB();
        try {
            a.globalMethod();
        }	catch(MyExseption_level1 e3) {
            System.out.println("Caught MyExseption_level1");
        }
    }
}