package Chapter21.Task36;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Chef implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private final Restaurant restaurant;
    private static Random rand = new Random(47);

    Chef(Restaurant rest) {
        restaurant = rest;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                OrderTicket orderTicket = restaurant.orderTickets.take();
                final List<Order> orders = orderTicket.getOrders();
                synchronized (orders) {
                    for (Order order : orders) {
                        Food requestedItem = order.item();
                        TimeUnit.MILLISECONDS.sleep(rand.nextInt(500));
                        Plate plate = new Plate(order, requestedItem);
                        order.getOrderTicket().getWaitPerson().filledOrders.put(plate);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
        System.out.println(this + " off duty");
    }

    @Override
    public String toString() {
        return "Chef " + id + " ";
    }
}
