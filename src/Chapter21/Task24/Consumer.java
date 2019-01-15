package Chapter21.Task24;

public class Consumer implements Runnable {
    private int buffer;

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (!isEmpty()) {
                        get();
                    }
                    notifyAll();
                    while (isFull()) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    boolean isFull() {
        return buffer >= 256;
    }

    boolean isEmpty() {
        return buffer <= 0;
    }

    void put() {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Overflow");
        }
        buffer++;
    }

    void get() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("There is nothing");
        }
        buffer--;
    }
}
