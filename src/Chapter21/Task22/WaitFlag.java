package Chapter21.Task22;

public class WaitFlag implements Runnable{

    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(500);
                wait();
                System.out.println("hello, world");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

