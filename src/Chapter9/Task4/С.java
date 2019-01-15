package Chapter9.Task4;

public class С extends A {

    int value = 2;
    B b;

    void print() {
        System.out.println("print C " + value );
    };

    public static void main(String[] args) {
        B b = new B();
        B.refToA(b);

    }
}
