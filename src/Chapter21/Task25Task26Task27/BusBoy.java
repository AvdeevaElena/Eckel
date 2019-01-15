package Chapter21.Task25Task26Task27;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BusBoy implements Runnable {
    private final Restaurant restaurant;
    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    BusBoy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();
                try {
                    while (!restaurant.needClean) {
                        condition.await();
                    }
                    System.out.println("Clean ");
                    restaurant.needClean = false;
                } finally {
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
