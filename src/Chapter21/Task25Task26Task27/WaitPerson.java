package Chapter21.Task25Task26Task27;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitPerson implements Runnable {
    private final Restaurant restaurant;
    final Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();

    WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                lock.lock();
                try {
                    while (restaurant.meal == null) {
                        condition.await();
                    }
                } finally {
                    lock.unlock();
                }
                System.out.println("Waitperson got " + restaurant.meal);
                restaurant.chef.lock.lock();
                try {
                    restaurant.meal = null;
                    restaurant.chef.condition.signalAll();
                    restaurant.busBoy.lock.lock();
                    try {
                        restaurant.needClean = true;
                        restaurant.busBoy.condition.signalAll();
                    } finally {
                        restaurant.busBoy.lock.unlock();
                    }
                } finally {
                    restaurant.chef.lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("WaitPerson interrupted");
        }
    }
}
