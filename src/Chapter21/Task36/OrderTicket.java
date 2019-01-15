package Chapter21.Task36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderTicket {
    private static int counter;

    private final int id = counter++;
    private final Table table;
    private final List<Order> orders = Collections.synchronizedList(new ArrayList<>());

    OrderTicket(Table table) {
        this.table = table;
    }

    WaitPerson getWaitPerson() {
        return table.getWaitPerson();
    }

    List<Order> getOrders() {
        return orders;
    }

    void placeOrder(Customer customer, Food food) {
        Order order = new Order(customer, food);
        order.setOrderTicket(this);
        orders.add(order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Ticket: ");
        sb.append(id);
        sb.append(" for: ");
        sb.append(table);
        sb.append("\n");
        synchronized (orders) {
            for (Order order : orders) {
                sb.append(order.toString());
                sb.append("\n");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
