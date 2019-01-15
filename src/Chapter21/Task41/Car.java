package Chapter21.Task41;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Car {
    private ExecutorService exec = Executors.newCachedThreadPool();
    private boolean waxOn = false;

    private synchronized void waxed() {
        waxOn = true;
        notify();
    }

    private synchronized void buffed() {
        waxOn = false;
        notify();
    }

    private synchronized void waitForWaxing() throws InterruptedException {
        while (!waxOn) {
            wait();
        }
    }

    private synchronized void waitForBuffing() throws InterruptedException {
        while (waxOn) {
            wait();
        }
    }

    public void waxOn() {
        exec.execute(() -> {
            try {
                while (!Thread.interrupted()) {
                    System.out.println("Wax On! ");
                    TimeUnit.MILLISECONDS.sleep(200);
                    waxed();
                    waitForBuffing();
                }
            } catch (InterruptedException e) {
                System.out.println("Exiting via interrupt");
            }
            System.out.println("Ending Wax On task");
        });
    }

    public void waxOff() {
        exec.execute(() -> {
            try {
                while (!Thread.interrupted()) {
                    waitForWaxing();
                    System.out.println("Wax Off! ");
                    TimeUnit.MILLISECONDS.sleep(200);
                    buffed();
                }
            } catch (InterruptedException e) {
                System.out.println("Exiting via interrupt");
            }
            System.out.println("Ending Wax Off task");
        });
    }

    public void shutdownNow() {
        exec.shutdownNow();
    }
}
