package Chapter12.Task20;


/*Exercise 20
/* MOdify StormyInning.java by adding an UmpireArgument exception type
* and methods that throw this exception. Test the modified hierarchy. */

public class StormyInning extends Inning implements Storm {
    // OK to add new exceptions for constructors, but you
    // must deal with the base constructor exceptions:
    public StormyInning()
            throws UmpireArgument, RainedOut, BaseballException {}
    public StormyInning(String s)
            throws Foul, BaseballException {}
    // Regular methods must comform to base class:
    //! void walk() throws PopFoul {} // Compile error
    // Interface CANNOT add exceptions to existing
    // methods from the base class:
    //! public void event() throws RainedOut {}
    // If method doesn't already exist in the
    // base class, the exception is OK:
    public void rainHard() throws RainedOut {}
    // You can choose to not throw any exceptions,
    // even if the base class version does:
    public void event() {}
    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul, ThrownFromGame {
        throw new ThrownFromGame();
    }
    public void questionableCall() throws UmpireArgument {
        throw new UmpireArgument();
    }
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.questionableCall();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(UmpireArgument e) {
            System.out.println("Umpire argument (StormyInning20)");
            // } catch(ThrownFromGame e) {
            //	System.out.println("Thrown from game");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from
            // the base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(ThrownFromGame e) {
            System.out.println("Thrown from game (Inning)");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
