package Chapter21.Task41;

import java.util.concurrent.TimeUnit;

// Modify WaxOMatic.java so that it implements active objects.

public class WaxOMatic {

    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.waxOn();
        car.waxOff();
        TimeUnit.SECONDS.sleep(5);
        car.shutdownNow();
    }
}
