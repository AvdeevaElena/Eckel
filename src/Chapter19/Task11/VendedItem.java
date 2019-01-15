package Chapter19.Task11;

public class VendedItem implements VendingInput {
    private String name;
    private int price = 0;
    VendedItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String name() { return name; }
    public int price() { return price; }
}
