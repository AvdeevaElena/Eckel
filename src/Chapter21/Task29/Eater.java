package Chapter21.Task29;

public class Eater implements Runnable {
        private ToastQueue finishedQueue;
        private int counter = 0;

        Eater(ToastQueue finished) {
            finishedQueue = finished;
        }

        public void run() {
            try {
                while (!Thread.interrupted()) {
                    Toast t = finishedQueue.take();
                    if (t.getId() != counter++ || t.getStatus() == Toast.Status.DRY) {
                        System.out.println(">>>> Error: " + t);
                        System.exit(1);
                    } else {
                        System.out.println("Chomp! " + t);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Eater interrupted");
            }
            System.out.println("Eater off");
        }
}