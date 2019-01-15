package Chapter7.Task13;

/**/
public class B extends A {
    void print(String str, int s) { System.out.println("Simple print" + str+ s); };

    public static void main(String[] args) {

        B b = new B();
        b.print();
        b.print(2);
        b.print("Str", 22);
        b.print(33,"Str");
    }
}
