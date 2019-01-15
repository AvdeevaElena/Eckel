package Chapter21.Task14;

import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

//Exercise 14: Demonstrate that java.util.Timer scales to large numbers by creating a program
// that generates many Timer
// * objects that perform some simple task when the timeout completes.

public class TimerTask {
    private static AtomicInteger ai = new AtomicInteger(0);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Timer timer = new Timer("Timer #" + i);
            timer.scheduleAtFixedRate(new java.util.TimerTask() {
                @Override
                public void run() {
                    System.out.println(ai.addAndGet(2));
                }
            }, 1000, 1000);
        }
    }
}
