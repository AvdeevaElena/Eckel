package Chapter21.Task29;

public class Jammer implements Runnable {
    private ToastQueue dryQueue, finishedQueue;

    Jammer(ToastQueue dryQueue, ToastQueue finishedQueue) {
        this.dryQueue = dryQueue;
        this.finishedQueue = finishedQueue;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueue.take();
                t.jam();
                System.out.println(t);
                finishedQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Jammer interrupted");
        }
        System.out.println("Jammer off");
    }
}
