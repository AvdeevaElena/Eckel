package Chapter21.Task35;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class WebClientGenerator implements Runnable {
    private static Random rand = new Random();

    private WebClientLine webClients;
    AtomicInteger loadFactor = new AtomicInteger(1);

    WebClientGenerator(WebClientLine webClients) {
        this.webClients = webClients;
    }


    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                TimeUnit.MILLISECONDS.sleep(rand.nextInt(300));
                webClients.put(new WebClient(rand.nextInt(1000 / loadFactor.get())));
            }
        } catch (InterruptedException e) {
            System.out.println("WebClientGenerator interrupted");
        }
        System.out.println("WebClientGenerator terminating");
    }
}
