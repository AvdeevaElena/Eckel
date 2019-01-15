package Chapter21.Task36;

public class Plate {
    private final Order order;
    private final Food food;

    Plate(Order order, Food food) {
        this.order = order;
        this.food = food;
    }

    Order getOrder() {
        return order;
    }

    Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return food.toString();
    }
}
