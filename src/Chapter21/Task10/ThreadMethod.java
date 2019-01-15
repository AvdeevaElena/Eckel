package Chapter21.Task10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMethod {

    private ExecutorService pool = Executors.newCachedThreadPool();

    Future<Integer> runTask(int count) {
        return pool.submit(new FibonacciCall(count));
    }

    void shutdown() {
        pool.shutdown();
    }
}
