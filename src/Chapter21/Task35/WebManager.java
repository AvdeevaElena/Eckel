package Chapter21.Task35;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class WebManager implements Runnable {
    private ExecutorService pool;
    private WebClientGenerator generator;
    private WebClientLine webClients;
    private Queue<Server> servers = new LinkedList<>();
    private int adjustmentPeriod;
    private boolean stable = true;
    private int preSize;

    WebManager(ExecutorService pool, WebClientGenerator generator, WebClientLine webClients, int adjustmentPeriod, int n) {
        this.pool = pool;
        this.generator = generator;
        this.webClients = webClients;
        this.adjustmentPeriod = adjustmentPeriod;
        for (int i = 0; i < n; i++) {
            Server server = new Server(webClients);
            this.pool.execute(server);
            servers.add(server);
        }
    }

    void adjustLoadFactor() {
        if (webClients.size() > preSize) {
            if (stable) {
                stable = false;
            } else if (!stable) {
                System.out.println("Get the load factor: " + generator.loadFactor.get());
                pool.shutdownNow();
            }
        } else {
            System.out.println("New load factor: " + generator.loadFactor.addAndGet(1));
            stable = true;
        }
        preSize = webClients.size();
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(adjustmentPeriod);
                adjustLoadFactor();
                System.out.print(webClients + " { ");
                for (Server server : servers) {
                    System.out.print(server.shortString() + " ");
                }
                System.out.println("}");
                adjustLoadFactor();
            }
        } catch (InterruptedException e) {
            System.out.println(this + "interrupted");
        }
        System.out.println(this + "terminating");
    }

    @Override
    public String toString() {
        return "WebManager ";
    }
}
