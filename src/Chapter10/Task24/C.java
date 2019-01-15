package Chapter10.Task24;

public class C {
     class Inner extends A.B{

         Inner(A a, int val) {
             a.super(val);
         };
     }

    public static void main(String[] args) {
         A a = new A();
         C c = new C();
         Inner inner = c.new Inner(a, 8);
        System.out.println(inner.val);

    }
}
