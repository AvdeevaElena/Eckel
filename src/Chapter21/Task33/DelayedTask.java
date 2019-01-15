package Chapter21.Task33;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

abstract class DelayedTask implements Runnable, Delayed {
    private long trigger;

    DelayedTask(int delayInMillis) {
        trigger = System.nanoTime() + TimeUnit.NANOSECONDS.convert(delayInMillis, TimeUnit.MILLISECONDS);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(trigger - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed otherObject) {
        DelayedTask other = (DelayedTask) otherObject;
        return Long.compare(trigger, other.trigger);
    }
}
