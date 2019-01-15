package Chapter10.Task7_1;
/* Create an interface with at least one method, and implement that interface by defining an inner class within
 a method, which returns a reference to your interface.*/
public class AB {

    A method_ab() {

        class B implements A{

            public void method_a() {
                A a = new B();
                System.out.println("method_a()");
            };
        }
        return new B();

    }

    public static void main(String[] args) {

        AB ab = new AB();
        ab.method_ab().method_a();
    }

}
