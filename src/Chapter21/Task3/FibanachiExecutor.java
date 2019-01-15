package Chapter21.Task3;

import Chapter21.Task2.Fibanachi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibanachiExecutor {


    public static void main(String[] args) {
         ExecutorService exec = Executors.newSingleThreadExecutor();
        //  ExecutorService exec = Executors.newFixedThreadPool(5);
       // ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i< 5;i++) {
            exec.execute(new Fibanachi(3));
        }
        exec.shutdown();
    }
}
