package Chapter21.Task30;

public class Receiver implements Runnable {
    private CharQueue charQueue;

    Receiver(CharQueue charQueue) {
        this.charQueue = charQueue;
    }

    public void run() {
        try {
            while (true) {
                System.out.print("Read: " + charQueue.take() + ", ");
            }
        } catch (InterruptedException e) {
            System.out.println(e + " Receiver sleep interrupted");
        }
    }
}
