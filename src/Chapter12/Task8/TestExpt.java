package Chapter12.Task8;

/* Exercise 8
/* Write a class with a method that throws an exception of the type created
* in Exercise 4. Try compiling it without an exception specification to see
* what the compiler says. Add the appropriate exception specification. Try
* out your class and its exception inside a try-catch clause.*/


import Chapter12.Task4.MyExption;

public class TestExpt {

  static   void f()throws MyExption {
        System.out.println( "In method f()");
     throw  new MyExption("Exseption STR");
    }

    public static void main(String[] args) {

        try { f(); }
        catch ( MyExption e) {e.printExpt(); e.printStackTrace();  }
    }
}
