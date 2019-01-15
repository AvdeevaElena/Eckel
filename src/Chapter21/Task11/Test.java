package Chapter21.Task11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
        public static void main(String[] args) {
    task  test = new task();
    ExecutorService pool = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++) {
        pool.execute(() -> {
            while (true) {
                test.change();
            }
        });
        pool.execute(() -> {
            while (true) {
                System.out.println(test.getEven());
                System.out.println(test.getHalf());
            }
        });
    }
    pool.shutdown();
}
}
