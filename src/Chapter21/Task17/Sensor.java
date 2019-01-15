package Chapter21.Task17;

import java.util.Random;

public class Sensor {

    private static final int BOUND = 1000;
    private int radiation;
    private Random random = new Random();

    synchronized void sense() {
        int change = random.nextInt(BOUND);
        if (random.nextBoolean()) {
            change = -change;
        }
        Thread.yield();
        radiation += change;
    }

    public synchronized int value() {
        return radiation;
    }
}
