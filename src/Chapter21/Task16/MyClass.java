package Chapter21.Task16;

/*Exercise 16: Modify Exercise 15 to use explicit Lock objects.*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass {

    private final Lock lockOne = new ReentrantLock();
    private final Lock lockTwo = new ReentrantLock();
    private final Lock lockThree = new ReentrantLock();


    void one() {
        lockOne.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("one()");
                Thread.yield();
            }
        } finally {
            lockOne.unlock();
        }
    }

    void two() {
        lockTwo.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("two()");
                Thread.yield();
            }
        } finally {
            lockTwo.unlock();
        }
    }


    void three() {
        lockThree.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("three()");
                Thread.yield();
            }
        } finally {
            lockThree.unlock();
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
