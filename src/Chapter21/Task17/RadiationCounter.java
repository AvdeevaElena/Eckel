package Chapter21.Task17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RadiationCounter implements Runnable {
    private List<Sensor> sensors = new ArrayList<>();
    private volatile boolean canceled;

    public void run() {
        while (!canceled) {
            synchronized (this) {
                for (Sensor rs : sensors) {
                    rs.sense();
                }
            }
        }
    }

    private void cancel() {
        canceled = true;
    }

    private synchronized void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    private synchronized int averageRadiation() {
        int result = 0;
        for (Sensor rs : sensors) {
            result += rs.value();
        }
        return result / sensors.size();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        List<RadiationCounter> counters = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            counters.add(new RadiationCounter());
        }
        for (RadiationCounter rc : counters) {
            for (int i = 0; i < 5; i++) {
                rc.addSensor(new Sensor());
                pool.execute(rc);
            }
        }
        for (RadiationCounter rc : counters) {
            pool.execute(() -> {
                while (!Thread.interrupted()) {
                    System.out.println("AverageRadiation: " + rc.averageRadiation());
                }
            });
        }
        TimeUnit.SECONDS.sleep(3);
        for (RadiationCounter rc : counters) {
            rc.cancel();
        }
        pool.shutdownNow();
    }


}
