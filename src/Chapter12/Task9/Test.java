package Chapter12.Task9;


/* Exercise 9
/* Create three new types of exceptions. Write a class with a method that
* throws all three. In main(), call the method but only use a single catch
* clause that will catch all three types of exceptions*/

public class Test {

    public static  void f(int value) throws MyExption_1, MyExption_2, MyExption_3 {

        if (value == 0) { throw new MyExption_1("value == 0");
        }
        if (value < 100) { throw new MyExption_1("value < 100");
        }
        if (value >= 100) { throw new MyExption_1("value >= 100");
        }
    }

    public static void main(String[] args) {

        try {
         //   f(0);
            f(99);
            f(100);
        }

        catch (Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }

    }
}
