package Chapter21.Task10;

import java.util.concurrent.Callable;

/* * Exercise 10: Modify Exercise 5 following the example of the ThreadMethod class, so that runTask( )
 takes an argument
 * of the number of Fibonacci numbers to sum, and each time you call runTask( ) it returns the Future produced by the
 * call to submit( )*/

public class FibonacciCall implements Callable<Integer> {
    private final int count;

    FibonacciCall(int count) {
        this.count = count;
    }


    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += fib(i);
        }
        return result;
    }

    private int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
