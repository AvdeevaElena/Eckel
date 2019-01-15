package Chapter12.Task10;

/*Exercise 10
/* Create a class with two methods, f() and g(). In g(), throw an exception of
* a new type that you define. In f(), call g(), catch its exception and, in the
* catch clause, throw a different exception (of a second type that you define).
* Test your code in main().*/

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
                throw new MyExption("Throw  MyExption");
            }
        } catch (MyExption mExp) {
            System.out.println("Caught MyExption");
            mExp.printStackTrace();
        }
    }

    public static void main(String[] args) {
        f();
    }

}

