package Chapter10.Task14;
/*Exercise 1: (2) Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.*/

public class Test {
    public static void rideCycle(CycleFactory factory) {
      Cycle cycle = factory.getCycle();
      cycle.ride();
    }

    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Tricycle.factory);
        rideCycle(Bicycle.factory);
    }
}
