package Chapter16.Task9;

public class Peel<T> {
    private T t;
    private static long counter;
    private final long id = counter++;
    public Peel(T t) { this.t = t; }
    public String toString() { return "Peel " + id + " " + t.toString(); }
}
