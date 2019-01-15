package Chapter21.Task18;
/*Exercise 18: Create a non-task class with a method that calls sleep( ) for a long interval.
 Create a task that calls
 * the method in the non-task class. In main( ), start the task, then call interrupt( ) to terminate it.
 * Make sure that
 * the task shuts down safely.*/

public class Sleep {

    void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
