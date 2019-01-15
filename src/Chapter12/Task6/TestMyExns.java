package Chapter12.Task6;

public class TestMyExns {
   static void  f() throws MyExption_1{
        System.out.println("void f() ");
      throw  new MyExption_1();
    }

    static  void g() throws MyExption_2{
        System.out.println("void g() ");
        throw  new MyExption_2();
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyExption_1 exption_1) {}

        try {
            g();
        } catch (MyExption_2 exption_2) {}

    }

}
