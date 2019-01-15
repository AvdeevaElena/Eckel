package Chapter8.Task10;

public class A {

    void method_1a() {
        System.out.println(" method_1a class A");
        method2();};

    void method2() {
        System.out.println(" method_2a class A");
    };

    static void change (A a) {a.method_1a(); }
}
