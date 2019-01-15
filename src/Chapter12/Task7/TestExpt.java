package Chapter12.Task7;


/*Exercise 7
// Modify Exercise 3 so that the catch clause logs the result.*/


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class TestExpt {
    private static int[] ia = new int[2];
    private static Logger logger = Logger.getLogger("Ex7 Exceptions");
    static void logException(Exception e) { // Exception e argument
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

        public static void main(String[] args) {
        int [] arr = new int[3];
        try {
              for (int i = 0; i<4; i++)
              arr[i] = i;
        }
        catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            logException(e);
        }
        finally {
            System.out.println("Finally Block");
        }
        }

}
