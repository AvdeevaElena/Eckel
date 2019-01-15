package Chapter7.Task11;

public class Deterent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrubQ");
    super.scrub(); // Call base-class version
}
    // Add methods to the interface: public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Deterent x = new Deterent();
        x.dilute();
        x.apply();
        x.scrub();
       // x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
