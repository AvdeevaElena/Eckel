package Chapter21.Task11;

public class task {
    private int even = 0;
    private double half = 0.5;

    synchronized int getEven() {
        return even;
    }

    synchronized double getHalf() {
        return half;
    }

    synchronized void change() {
        ++even;
        ++even;
        half += 0.25;
        half += 0.25;
        half += 0.25;
        half += 0.25;
    }
}
