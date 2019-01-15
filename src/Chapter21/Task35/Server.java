package Chapter21.Task35;

import java.util.concurrent.TimeUnit;

public class Server implements Runnable {
    private static int counter = 0;

    private final int id = counter++;
    private WebClientLine webClients;

    Server(WebClientLine webClients) {
        this.webClients = webClients;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                WebClient webClient = webClients.take();
                TimeUnit.MILLISECONDS.sleep(webClient.getServiceTime());
            }
        } catch (InterruptedException e) {
            System.out.println(this + "interrupted");
        }
        System.out.println(this + "terminating");
    }

    @Override
    public String toString() {
        return "Server " + id + " ";
    }

    String shortString() {
        return "T" + id;
    }
}
