package Chapter21.Task21;

public class Fist implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            try {
                wait();
                System.out.println("Hello, world");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }

