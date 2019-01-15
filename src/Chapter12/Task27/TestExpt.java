package Chapter12.Task27;


/*Exercise 27
// Modify Exercise 3 to convert the exception to a Runtime Exception.
*/


public class TestExpt {
    public static void main(String[] args) {
        int [] arr = new int[3];
        try {
              for (int i = 0; i<4; i++)
              arr[i] = i;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Catch Block");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Finally Block");
        }
        }

}
