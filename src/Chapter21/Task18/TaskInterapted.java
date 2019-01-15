package Chapter21.Task18;

import java.util.concurrent.TimeUnit;

public class TaskInterapted implements Runnable {

    private Sleep sleep;

    TaskInterapted (Sleep sleep) {
        this.sleep = sleep;
    }

    @Override
    public void run() {
        sleep.sleep();
        System.out.println("Exit safely");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new TaskInterapted(new Sleep()));
        thread.start();
        TimeUnit.MILLISECONDS.sleep(100);
        thread.interrupt();
        System.out.println("Exiting main");
    }
}
