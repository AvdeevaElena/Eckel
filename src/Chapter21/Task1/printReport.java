package Chapter21.Task1;


/*Implement a Runnable. Inside run( ), print a message, and then call yield( ). Repeat this three times,
and then return from run( ). Put a startup message in the constructor and a shutdown message when
the task terminates. Create a number of these tasks and drive them using threads.Implement a Runnable.
Inside run( ), print a message, and then call yield( ). Repeat this three times, and then return from run( ).
 Put a startup message in the constructor and a shutdown message when the task terminates.
 Create a number of these tasks and drive them using threads.*/
public class printReport implements  Runnable{

    public printReport () {
        System.out.println("Start");
    }
    public void run() {
       for (int i = 0; i<3;i++){
            System.out.println( "Report " + i);
            Thread.yield();
        }

        System.out.println("Finish");
    }

    public static void main(String[] args) {
        printReport pr = new printReport();
       // pr.run();

        Thread th1 = new Thread(pr);
        Thread th2 = new Thread(pr);

        th1.start();
        th2.start();
    }
}
