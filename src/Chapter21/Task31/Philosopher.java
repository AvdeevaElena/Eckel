package Chapter21.Task31;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Philosopher implements Runnable {
    private ChopstickBin bin;
    private Chopstick left;
    private Chopstick right;
    private final int id;
    private final int ponderFactor;
    private Random rand = new Random();

    private void pause() throws InterruptedException {
        if (ponderFactor == 0) {
            return;
        }
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(ponderFactor * 250));
    }

    public Philosopher(ChopstickBin bin, int ident, int ponder) {
        this.bin = bin;
        id = ident;
        ponderFactor = ponder;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println(this + " thinking");
                pause();
                System.out.println(this + " get two chopsticks");
                TwoTuple<Chopstick, Chopstick> pair = bin.get();
                left = pair.first;
                right = pair.second;
                System.out.println(this + " eating");
                pause();
                bin.add(left, right);
            }
        } catch (InterruptedException e) {
            System.out.println(this + " exiting via interrupt");
        }
    }

    public String toString() {
        return "Philosopher " + id;
    }
}
