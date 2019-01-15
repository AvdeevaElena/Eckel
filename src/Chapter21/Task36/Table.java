package Chapter21.Task36;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public class Table implements Runnable {
    private static int counter;
    private final int id = counter++;
    private final WaitPerson waitPerson;
    private final List<Customer> customers;
    private final OrderTicket orderTicket = new OrderTicket(this);
    private final CyclicBarrier cyclicBarrier;
    private final int nCustomers;
    private final ExecutorService pool;

    Table(WaitPerson waitPerson, int nCustomers, ExecutorService pool) {
        this.waitPerson = waitPerson;
        this.nCustomers = nCustomers;
        customers = Collections.synchronizedList(new LinkedList<>());
        this.pool = pool;
        cyclicBarrier = new CyclicBarrier(nCustomers + 1, () -> System.out.println(orderTicket));
    }

    WaitPerson getWaitPerson() {
        return waitPerson;
    }

    void placeOrder(Customer customer, Food food) {
        orderTicket.placeOrder(customer, food);
    }

    @Override
    public void run() {
        Customer customer;
        for (int i = 0; i < nCustomers; i++) {
            customers.add(customer = new Customer(this, cyclicBarrier));
            pool.execute(customer);
        }
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            System.out.println(this + " Interrupted");
            return;
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        waitPerson.placeOrderTicket(orderTicket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Table: ");
        sb.append(id);
        sb.append(" served by: ");
        sb.append(waitPerson);
        sb.append("\n");
        synchronized (customers) {
            for (Customer customer : customers) {
                sb.append(customer);
                sb.append("\n");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
