package Chapter10.Task19;
/*reate an interface that contains a nested class that has a static method that calls the methods of
 * your interface and displays the results. Implement your interface and pass an instance of your implementation to
 * the method.*/
public class C  implements A {

    public void report(){
        System.out.println("Hello from C");
    };
    public static void main(String[] args) {

        A a = new C();


        A.B.report_static(a);
    }
}
