package Chapter21.Task9;

import java.util.concurrent.ThreadFactory;

class PriorityThreadFactory implements ThreadFactory {
    private int priority;

    PriorityThreadFactory(int priority) {
        this.priority = priority;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(priority);
        return thread;
    }
}