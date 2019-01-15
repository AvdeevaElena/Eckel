package Chapter10.Task7;

public class Outer {

    private int value = 100;
    private int method() {return value;};

    class Inner {
        void change() {
            value = 200;
            int b = method();
            System.out.println(value);
        }
    }
   void method_2() {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
            inner.change();
   };

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method_2();
    }
}
