package Chapter10.Task1;


/*Exercise 1: (1) Write a class named Outer that contains an inner class named Inner. Add a method to Outer
that returns an object of type Inner. In main( ), create and initialize a reference to an Inner.*/

public class Outer {

    class Inner{
        Inner(){
            System.out.println(" I am Inner");
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
    }
}
