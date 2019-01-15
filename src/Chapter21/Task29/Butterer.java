package Chapter21.Task29;

public class Butterer implements Runnable {
    private ToastQueue dryQueue, finishedQueue;

    Butterer(ToastQueue dryQueue, ToastQueue finishedQueue) {
        this.dryQueue = dryQueue;
        this.finishedQueue = finishedQueue;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Toast t = dryQueue.take();
                t.butter();
                System.out.println(t);
                finishedQueue.put(t);
            }
        } catch (InterruptedException e) {
            System.out.println("Butterer interrupted");
        }
        System.out.println("Butterer off");
    }
}

