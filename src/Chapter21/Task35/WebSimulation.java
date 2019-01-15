package Chapter21.Task35;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WebSimulation {
    private static final int MAX_LINE_SIZE = 50;
    private static final int ADJUSTMENT_PERIOD = 1000;
    private static final int NUM_OF_SERVER = 5;

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newCachedThreadPool();
        WebClientLine webClients = new WebClientLine(MAX_LINE_SIZE);
        WebClientGenerator generator = new WebClientGenerator(webClients);
        pool.execute(new WebClientGenerator(webClients));
        pool.execute(new WebManager(pool, generator, webClients, ADJUSTMENT_PERIOD, NUM_OF_SERVER));
        if (args.length > 0) {
            TimeUnit.SECONDS.sleep(new Integer(args[0]));
        } else {
            System.out.println("Press 'Enter' to quit");
            System.in.read();
        }
        pool.shutdownNow();
    }
}
