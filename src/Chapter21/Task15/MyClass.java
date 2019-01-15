package Chapter21.Task15;

/*Exercise 15: Create a class with three methods containing critical sections that all synchronize on the same object.
 * Create multiple tasks to demonstrate that only one of these methods can run at a time. Now modify the methods so
  * that
 * each one synchronizes on a different object and show that all three methods can be running at once.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyClass {

    private final Object syncOne = new Object();
    private final Object syncTwo = new Object();
    private final Object syncThree = new Object();

    void one() {
        synchronized (syncOne) {
            for (int i = 0; i < 10; i++) {
                System.out.println("one()");
                Thread.yield();
            }
        }
    }

    void two() {
        synchronized (syncTwo) {
            for (int i = 0; i < 10; i++) {
                System.out.println("two()");
                Thread.yield();
            }
        }
    }

    void three() {
        synchronized (syncThree) {
            for (int i = 0; i < 10; i++) {
                System.out.println("three()");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        MyClass temp = new MyClass();
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(temp::one);
        pool.execute(temp::two);
        pool.execute(temp::three);
        pool.shutdown();
    }
}
