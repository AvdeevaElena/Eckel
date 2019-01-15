package Chapter8.Task5;
/*E) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of wheels.
 Modify ride( ) to call wheels( ) and verify that polymorphism works.*/

public class Test {
    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle cycle = new Cycle();

        cycle.ride (unicycle);
        cycle.ride (bicycle);
        cycle.ride (tricycle);
    }
}
