package Chapter12.Task15;


/*Exercise 15
// Show that WithFinally.java doesn't fail by throwing a
// RuntimeException inside the try block.*/

public class WithFinally {
    private static Switch sw = new Switch();
    // set up x[0] = null:
    private static Integer[] x = new Integer[1];
    public static void f(int i)
            throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code to throw NullPointerException:
            f(x[0]);
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
    }
}
