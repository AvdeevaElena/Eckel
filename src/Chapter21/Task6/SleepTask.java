package Chapter21.Task6;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

/*Exercise 6: (2) Create a task that sleeps for a random amount of time between 1 and 10 seconds,
then displays its sleep time and exits. Create and run a quantity (given on the command line) of these tasks.
*/

public class SleepTask implements Callable {


    public Random r = new Random();

    public Integer call() {
        int sleep_time = r.nextInt(10);
        try {
            Thread.sleep(sleep_time * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return sleep_time;
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();

        for (int i = 0; i < task; i++) {
            Future<Integer> sleep_t = exec.submit(new SleepTask());
            try {
                System.out.println(sleep_t.get());
            } catch (InterruptedException e) {
            } catch (ExecutionException ex) {
            }
        }
    }
}