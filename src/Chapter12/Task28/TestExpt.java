package Chapter12.Task28;

/*Exceptions, Exercise 28,
/* Modify Exercise 4 so that the custom exception class inherits from
* RuntimeException, and show that the compiler allows you to leave
* out the try block.*/

public class TestExpt {

  static   void f()throws MyExption {
        System.out.println( "In method f()");
     throw  new MyExption("Exseption STR");
    }

    public static void main(String[] args) {

         f();

    }
}
