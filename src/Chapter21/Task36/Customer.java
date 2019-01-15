package Chapter21.Task36;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.SynchronousQueue;

public class Customer implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Table table;
    private final CyclicBarrier barrier;
    private int nPlates;
    private SynchronousQueue<Plate> placeSetting = new SynchronousQueue<>();

    Customer(Table table, CyclicBarrier barrier) {
        this.table = table;
        this.barrier = barrier;
    }

    void deliver(Plate p) throws InterruptedException {
        placeSetting.put(p);
    }

    @Override
    public void run() {
        for (Course course : Course.values()) {
            Food food = course.randomSelection();
            table.placeOrder(this, food);
            ++nPlates;
        }
        try {
            barrier.await();
        } catch (InterruptedException e) {
            System.out.println(this + " Interrupted");
            return;
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < nPlates; i++) {
            try {
                System.out.println(this + " eating " + placeSetting.take());
            } catch (InterruptedException e) {
                System.out.println(this + " waiting for meal interrupted");
                return;
            }
        }
        System.out.println(this + "finished meal, leaving");
    }

    @Override
    public String toString() {
        return "Customer " + id + " ";
    }
}
