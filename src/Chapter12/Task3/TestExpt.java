package Chapter12.Task3;


/*Chapter Exceptions, Exercise 3
Write code to generate and catch an ArrayIndexOutOfBoundsException.*/


public class TestExpt {
    public static void main(String[] args) {
        int [] arr = new int[3];
        try {
              for (int i = 0; i<4; i++)
              arr[i] = i;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Catch Block");
             e.printStackTrace();
        }
        finally {
            System.out.println("Finally Block");
        }
        }

}
