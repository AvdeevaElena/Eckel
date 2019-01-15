package Chapter9.Task3;

public class С extends A {

    int value = 2;
    B b;

    void print() {
        System.out.println("print C " + value );
    };

    public static void main(String[] args) {

        С c = new С();
        c.print();

    }
}
