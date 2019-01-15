package Chapter12.Task4;

/*Chapter Exceptions, Exercise 4
/* Create your own exception class using the extends keyword. Write a
* constructor for this class that takes a String argument and stores it inside
* the object with a String reference. Write a method that displays the stored
* String. Create a try-catch clause to exercise your new exception.*/

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
