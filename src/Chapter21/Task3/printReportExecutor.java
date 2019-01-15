

import Chapter21.Task1.printReport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printReportExecutor {
    printReportExecutor () {
        System.out.println("Start");
    }
    public static void main(String[] args) {
       // ExecutorService exec = Executors.newSingleThreadExecutor();
      //  ExecutorService exec = Executors.newFixedThreadPool(5);
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i< 5;i++) {
            exec.execute(new printReport());
        }
        exec.shutdown();
    }
}
