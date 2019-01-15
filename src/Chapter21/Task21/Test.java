package Chapter21.Task21;

/*Exercise 21: Create two Runnables, one with a run( ) that starts and calls wait( ). The second class should capture
 * the reference of the first Runnable object. Its run( ) should call notifyAll( ) for the first task after some
  * number
 * of seconds have passed so that the first task can display a message. Test your classes using an Executor.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        Fist first = new Fist();
        Second second = new Second(first);
        pool.execute(first);
        pool.execute(second);
        pool.shutdown();
}
}
