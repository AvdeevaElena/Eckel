package Chapter19.Task11;

public class VendingEvent implements VendingInput{
    private String name;
    VendingEvent(String name) {
        this.name = name;
    }
    public String name() { return name; }
}
