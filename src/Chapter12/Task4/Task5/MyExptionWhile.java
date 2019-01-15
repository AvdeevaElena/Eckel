package Chapter12.Task4.Task5;


/*Create you own resumption-like behavior using a while loop that repeats
 * until an exception is no longer thrown.*/

public class MyExptionWhile {

    private static int[] arr = new int[2];
    static int value = 5;
    public static void main(String[] args) {
        while(true) {
            try {
                arr[value] = 1;
                System.out.println(arr[value]);
                break;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(
                        "It is ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                value--;
            } finally {
                System.out.println("In block finally");
            }
        }
        System.out.println("Finish");
    }
}
