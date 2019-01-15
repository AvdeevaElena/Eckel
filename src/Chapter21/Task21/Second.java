package Chapter21.Task21;

public class Second implements Runnable {
    private final Fist fist;

    Second(Fist fist) {
        this.fist = fist;
    }

    @Override
    public void run() {
        synchronized (fist) {
            try {
                Thread.sleep(1000);
                fist.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}