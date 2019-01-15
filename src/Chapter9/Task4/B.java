package Chapter9.Task4;

public class B extends A {

    int value =2;

    B() {
        System.out.println("Const B");
    };
    void print() {
        System.out.println("print B" +value );
    };

    static void refToA(A a) {
        B b =(B)a;
        b.print();

    }
}
