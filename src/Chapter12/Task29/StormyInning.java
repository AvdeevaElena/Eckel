package Chapter12.Task29;

/*Exceptions, Exercise 29
/* Modify all the exception types in StormyInning.java so that they extend
* RuntimeException, and show that no exception specifications or try blocks
* are necessary. Remove the '//!' comments and show how the methods can be
* compiled without specifications.*/

public class StormyInning extends Inning implements Storm {
    public StormyInning() {}
    public StormyInning(String s) {}
    public void walk() {}
    public void event() {}
    public void rainHard() {}
    public void atBat() {}
    public static void main(String[] args) {
        StormyInning si = new StormyInning();
        si.atBat();

        System.out.println("UPCASTING");

        Inning i = new StormyInning();
        i.atBat();
    }
}
