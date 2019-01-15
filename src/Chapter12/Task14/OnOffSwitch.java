package Chapter12.Task14;

//Exercise 14: Show that OnOffSwitch.java can fail by throwing a RuntimeException inside the try block.

public class OnOffSwitch {

    private static Switch sw = new Switch();
    static Integer[] x = new Integer[1];
    public static void f(int i) throws OnOffException1, OnOffException2 {}
    public static void main(String[] args) {
        try {
            sw.on();
            // Code that can throw RuntimeException
            // and leave Switch on:
            f(x[0]);
            sw.off();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
