package Chapter21.Task22;

public class Flag implements Runnable {
    private final WaitFlag bsr;

    Flag(WaitFlag bsr) {
        this.bsr = bsr;
    }

    @Override
    public void run() {
        synchronized (bsr) {
            try {
                Thread.sleep(1000);
                bsr.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
