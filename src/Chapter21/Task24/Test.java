package Chapter21.Task24;

/*Exercise 24: Solve a single-producer, single-consumer problem using wait( ) and notifyAll( ). The producer must not
 * overflow the receiver’s buffer, which can happen if the producer is faster than the consumer. If the consumer is
 * faster than the producer, then it must not read the same data more than once. Do not assume anything about the
 * relative speeds of the producer or consumer*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        Consumer consumer = new Consumer();
        Producer producer = new Producer(consumer);
        pool.execute(consumer);
        pool.execute(consumer);
        TimeUnit.SECONDS.sleep(3);
        pool.shutdownNow();
    }
}
