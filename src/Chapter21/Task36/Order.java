package Chapter21.Task36;

public class Order {
    private static int counter = 0;
    private final int id = counter++;
    private final Customer customer;
    private final Food food;
    private OrderTicket orderTicket;

    Order(Customer customer, Food food) {
        this.customer = customer;
        this.food = food;
    }

    Food item() {
        return food;
    }

    Customer getCustomer() {
        return customer;
    }

    void setOrderTicket(OrderTicket orderTicket) {
        this.orderTicket = orderTicket;
    }

    OrderTicket getOrderTicket() {
        return orderTicket;
    }

    @Override
    public String toString() {
        return "Order: " + id + " item: " + food + " for: " + customer;
    }
}
