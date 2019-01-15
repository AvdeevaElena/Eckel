package Chapter21.Task2;
/*Following the form of generics/Fibonacci.java, create a task that produces a sequence of n Fibonacci numbers,
 where n is provided to the constructor of the task. Create a number of these tasks and drive them using threads*/

public class Fibanachi implements Runnable {

    int value;
   public  Fibanachi(int value) {

        this.value = value;
    }
    void fib () {
        int f = 0;
        int s = 1;
        int sum = 0;

        for (int i = 0; i < value; i++) {
            s = f + s;
            f = s;
            sum = s;
            System.out.println(sum + " ");
        }
    }
        public void run() {

                System.out.println(Thread.currentThread().getName());
                 fib ();
             }

    public static void main(String[] args) {

        Fibanachi fb1 = new Fibanachi(3);
        Thread th2 = new Thread(fb1);
        Thread th = new Thread(fb1);
        th.run();
        th2.run();
    }


}
