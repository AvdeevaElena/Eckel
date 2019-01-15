package Chapter21.Task30;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sender implements Runnable {
    private Random rand = new Random();
    private CharQueue charQueue;

    Sender(CharQueue charQueue) {
        this.charQueue = charQueue;
    }

    public void run() {
        try {
            while (true)
                for (char c = 'A'; c <= 'z'; c++) {
                    charQueue.put(c);
                    TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
                }
        } catch (InterruptedException e) {
            System.out.println(e + " Sender sleep interrupted");
        }
    }
}
