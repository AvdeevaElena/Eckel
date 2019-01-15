package Chapter8.Task1;
/*Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.*/

public class Test {
    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle cycle = new Cycle();

        cycle.ride(unicycle);
        cycle.ride(bicycle);
        cycle.ride(bicycle);
    }
}
