package Chapter10.Task8_1;

/* Create an interface with at least one method, and implement that interface by defining an inner class within
 a method, which returns a reference to your interface.*/
public class AB {

    void goo(int a) {
        if (a == 5 ) {

            class C implements A{
                public void method_a(){

                    System.out.println("method_a");
                }
            }
            C c =new C();
            c.method_a();
        }
        else System.out.println("_________");

    }

    public static void main(String[] args) {
        AB ab = new AB();
        ab.goo(5);
       // ab.goo(4);

    }

}
