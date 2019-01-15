package Chapter12.Task11;

/*Exercise 11
/* Repeat the previous exercise, but inside the catch clause, wrap g()'s
* exception in a RuntimeException.
*/

public class Test {

    static void g() throws MyExption2 {

        throw new MyExption2("void g()");
    }


    static void f(){
        try {
            try {
                g();
            } catch (MyExption2 me2) {
                System.out.println("Caught MyExption2 in f inner try");
                me2.printStackTrace();
                throw new RuntimeException("Throw  MyExption");
            }
        } catch ( Exception e) {e.toString();}
    }

    public static void main(String[] args) {
        f();
    }

}

