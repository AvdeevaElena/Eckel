package Chapter21.Task30;

//Exercise 30: Modify PipedIO.java to use a BlockingQueue instead of a pipe.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PipedIO {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        CharQueue charQueue = new CharQueue();
        Sender sender = new Sender(charQueue);
        Receiver receiver = new Receiver(charQueue);
        pool.execute(sender);
        pool.execute(receiver);
        TimeUnit.SECONDS.sleep(5);
        pool.shutdownNow();
}
}
