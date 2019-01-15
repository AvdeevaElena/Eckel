package Chapter21.Task19Task32;

import java.util.Random;

public class Count {
    private int count = 0;
    private Random rand = new Random();

    synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean()) {
            Thread.yield();
        }
        return (count = ++temp);
    }

    public synchronized int value() {
        return count;
    }
}
