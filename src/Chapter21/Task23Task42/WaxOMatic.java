package Chapter21.Task23Task42;

/* * Exercise 23: Demonstrate that WaxOMatic.java works successfully when you use notify( ) instead of notifyAll( ).
 * Exercise 42: Modify WaxOMatic.java so that it implements active objects.*/

import java.util.concurrent.TimeUnit;

public class WaxOMatic {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.waxOn();
        car.waxOff();
        TimeUnit.SECONDS.sleep(5);
        car.shutdownNow();
    }
}
