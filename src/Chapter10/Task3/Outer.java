package Chapter10.Task3;


/*Exercise 3: (1) Modify Exercise 1 so that Outer has a private String field (initialized by the constructor), and
 Inner has a toString( ) that displays this field. Create an object of type Inner and display it.*/

public class Outer {

    private String str;
    Outer() {
        str = "Outer";
    }
    class Inner{
        Inner(){
            System.out.println(" I am Inner");
        }
        public String toString() {
            return str;
        }

        public Outer returnRef() {
            return Outer.this;
        }



    }

   Inner methodOuter(){
        Outer outer = new Outer();
        Inner inner = outer.new Inner();

        return inner;
   }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Inner inner = outer.methodOuter();
        System.out.println(inner.toString());
    }
}
