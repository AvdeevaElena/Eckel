package Chapter21.Task31;

import java.util.ArrayList;
import java.util.List;

public class ChopstickBin {
    private List<Chopstick> chopsticks = new ArrayList<>();

    {
        for (int i = 0; i < 4; i++) {
            chopsticks.add(new Chopstick());
        }
    }

    public synchronized void add(Chopstick left, Chopstick right) {
        chopsticks.add(left);
        chopsticks.add(right);
        notifyAll();
    }

    public synchronized TwoTuple<Chopstick, Chopstick> get() throws InterruptedException {
        while (chopsticks.size() <= 2) {
            wait();
        }
        Chopstick first = chopsticks.remove(0);
        Chopstick second = chopsticks.remove(0);
        return new TwoTuple<>(first, second);
    }
}