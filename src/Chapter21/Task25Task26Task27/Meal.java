package Chapter21.Task25Task26Task27;

public class Meal {
    private final int orderNum;

    Meal(int orderNum) {
        this.orderNum = orderNum;
    }

    public String toString() {
        return "Meal " + orderNum;
    }
}
