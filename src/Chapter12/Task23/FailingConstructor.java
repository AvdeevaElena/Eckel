package Chapter12.Task23;

/*Exercise 23
/* Add a class with a dispose() method to the previous exercise. Modify
* FailingConstructor so that the constructor creates one of these disposable
* objects, after which the constructor might through an exception, after which
* it creates a second disposable member object. Write code to properly guard
* against failure, and in main() verify that all possible failure situations */

public class FailingConstructor {

    String str;
    Integer [] arr = new Integer[3];
    HaveDespose hd_1;
    HaveDespose hd_2;

    FailingConstructor(String str) throws Exception {
        hd_1 = new HaveDespose() ;
        try {
            this.str = str;
            arr[3] = 3;
            try {
                hd_2 = new HaveDespose();
            } catch (Exception e) {
                System.out.println("Try to call  hd_1.despose();");
                hd_1.despose();
            }
        }catch (Exception e) {
            System.out.println("In a big try loop;");
        }

    }

    public static void main(String[] args) {
       try {
           FailingConstructor fc = new FailingConstructor("SomeThing");
       }
       catch( Exception e) {};

        System.out.println( HaveDespose.count);
   }
}
