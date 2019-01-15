package Chapter19.Task11;

public class MonetaryUnit implements VendingInput {
    private String name;
    private int amount = 0;
    MonetaryUnit(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public String name() { return name; }
    public int amount() { return amount; }
}
