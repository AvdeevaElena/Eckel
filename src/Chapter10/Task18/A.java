package Chapter10.Task18;
//Create an interface containing a nested class. Implement this interface and create an instance of the nested class.
public interface A {

    void report();
    public class B implements A{
        public void report(){
            System.out.println( "Hello from A");
        }
    }
}
