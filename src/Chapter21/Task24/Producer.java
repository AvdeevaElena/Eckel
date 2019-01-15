package Chapter21.Task24;

public class Producer  implements Runnable {
    private final Consumer consumer;

    Producer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (consumer) {
                    while (!consumer.isFull()) {
                        consumer.put();
                    }
                    notifyAll();
                    while (consumer.isFull()) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
