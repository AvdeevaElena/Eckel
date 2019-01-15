package Chapter21.Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        ThreadMethod tm = new ThreadMethod();
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 15; i < 20; i++) {
            futures.add(tm.runTask(i));
        }

        for (Future<Integer> f : futures) {
            try {
                System.out.println(f.get() + " ");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } finally {
                tm.shutdown();
            }
        }
    }
}