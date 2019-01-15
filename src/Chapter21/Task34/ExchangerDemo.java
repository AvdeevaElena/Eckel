package Chapter21.Task34;

import Chapter21.Task34.generics.coffee.Coffee;

import java.util.List;
import java.util.concurrent.*;

public class ExchangerDemo {
    static int size = 10;
    private static int delay = 5;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        Exchanger<List<Coffee>> exchanger = new Exchanger<>();
        List<Coffee>
                producerList = new CopyOnWriteArrayList<>(),
                consumerList = new CopyOnWriteArrayList<>();
        exec.execute(new ExchangerProducer<>(Coffee::new, exchanger, producerList));
        exec.execute(new ExchangerConsumer<>(exchanger, consumerList));
        TimeUnit.SECONDS.sleep(delay);
        exec.shutdownNow();
    }
}