package Chapter21.Task5;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibanachiCallable {
    public static void main(String[] args) {
        int value = 4;
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results= new ArrayList<Future<Integer>>();
        for (int i = 0; i<5;i++){
            results.add(exec.submit( new Fibanachi(value)));
        }
        for (Future<Integer> fs: results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
            } finally {
                exec.shutdown();
            }
        }
    }
}
