package Chapter21.Task37;

import java.util.HashSet;
import java.util.Set;

public class RobotPool {
    private Set<Robot> pool = new HashSet<>();

    synchronized void hire(Class<? extends Robot> robotType, Assembler d)
            throws InterruptedException {
        for (Robot r : pool)
            if (r.getClass().equals(robotType)) {
                pool.remove(r);
                r.assignAssembler(d)
                        .engage();
                return;
            }
        wait();
        hire(robotType, d);
    }

    synchronized void release(Robot r) {
        pool.add(r);
        notifyAll();
    }
}
