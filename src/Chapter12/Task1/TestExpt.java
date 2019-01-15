package Chapter12.Task1;

public class TestExpt  {

    public static void f() throws MyExption{

        System.out.println("Hello from  method f()"  );
        throw new MyExption("MY EXPTION");
    }

    public static void main(String[] args) {
       try {
           f();
       }
       catch (MyExption e) {
            e.printStackTrace();
       }
       finally {
           System.out.println("Hello from  finally");
       }
    }
}
