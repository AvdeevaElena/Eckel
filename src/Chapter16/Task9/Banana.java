package Chapter16.Task9;

public class Banana {
    private static long counter;
    private final long id = counter++;
    public String toString() { return "Banana " + id; }
}
