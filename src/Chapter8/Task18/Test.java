package Chapter8.Task18;
/*(2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and Bicycle,
but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
 Try to call balance( ) on each element of the array and observe the results.
 Downcast and call balance( ) and observe what happens(2) Using the Cycle hierarchy from Exercise 1,
  add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
  them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results.
   Downcast and call balance( ) and observe what happens*/

public class Test {
    public static void main(String[] args) {

        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle cycle = new Cycle();

        cycle.ride (unicycle);
        cycle.ride (bicycle);
        cycle.ride (tricycle);

        Cycle [] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle i: cycles) i.balance();

        unicycle = (Unicycle)cycles[0];
        bicycle = (Bicycle)cycles[1];
        tricycle = (Tricycle)cycles[2];

        unicycle.balance();
        bicycle.balance();
        tricycle.balance();
    }
}
