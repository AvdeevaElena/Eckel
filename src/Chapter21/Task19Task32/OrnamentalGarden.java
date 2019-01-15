package Chapter21.Task19Task32;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/*Exercise 19: Modify OrnamentalGarden.java so that it uses interrupt( ).
         * Exercise 32: Use a CountDownLatch to solve the problem of correlating the results from the Entrances in
         * OrnamentalGarden.java. Remove the unnecessary code from the new version of the example.
*/
public class OrnamentalGarden {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new Entrance(i, countDownLatch));
        }
        TimeUnit.SECONDS.sleep(2);
        exec.shutdownNow();
        TimeUnit.SECONDS.sleep(2);
        Entrance.cancel();
        countDownLatch.await();
        System.out.println("Total: " + Entrance.getTotalCount());
        System.out.println("Sum of Entrances: " + Entrance.sumEntrances());
    }
}
