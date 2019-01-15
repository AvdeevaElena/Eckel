package Chapter7.Task8;

public class B extends A {
    int b;

    B() {
        super(1);
        System.out.println("Const B");

        this.b = b;
    }


    B(int b) {

        super(2);
        System.out.println("Const B2");

        this.b= b;
    };

    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.b);
        System.out.println(b.a);

        B ba = new B(4);
        System.out.println(ba.b);
        System.out.println(ba.a);

    }
}
