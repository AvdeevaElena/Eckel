package Chapter12.Task13;


/*  Exercise 13
/* Modify Exercise 9 by adding a finally clause. Verify that your
* finally clause is executed, even if a NullPointerException is thrown.*/

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
        finally {
            System.out.println("In finaly block");
        }

    }
}
