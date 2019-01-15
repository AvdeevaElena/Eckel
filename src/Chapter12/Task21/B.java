package Chapter12.Task21;

/*Exercise 21
// Demonstrate that a derived-class constructor cannot catch exceptions thrown
// by its base-class constructor.*/

public class B  extends A{
    B() throws MyExption {
        super();

        // try {
        //	super();
        // } catch(BaseException e) {}

    }


    public static void main(String[] args) {
        try {
            B b = new B();
        } catch(MyExption e) {
            System.out.println("BaseException caught in main()");
        }

    }
}
