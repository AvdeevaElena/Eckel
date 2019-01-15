package Chapter10.Task19;
/*Create an interface that contains a nested class that has a static method that calls the methods of
 * your interface and displays the results. Implement your interface and pass an instance of your
  * implementation to the method.*/
public interface A {

    void report();
    public class B implements Chapter10.Task18.A {
        public void report() {
            System.out.println("Hello from A");
        }

        public static void report_static(A a){
            a.report();
            System.out.println( "Hello from A.STATIC");
        }
    }
}
