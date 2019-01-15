package Chapter21.Task5;
/*Following the form of generics/Fibonacci.java, create a task that produces a sequence of n Fibonacci numbers,
 where n is provided to the constructor of the task. Create a number of these tasks and drive them using threads*/

import java.util.concurrent.Callable;

public class Fibanachi implements Callable<Integer> {

    int value;
   public Fibanachi(int value) {

        this.value = value;
    }
     int sumFib () {
        int f = 0;
        int s = 1;
        int sum = 0;
        int resSum = 0;

        for (int i = 0; i < value; i++) {
            s = f + s;
            f = s;
            sum = s;
          //  System.out.println(sum + " ");
        }
        resSum +=sum;
        return resSum;
    }


        public Integer call() {

               System.out.println(Thread.currentThread().getName());
               return sumFib ();
             }

}
