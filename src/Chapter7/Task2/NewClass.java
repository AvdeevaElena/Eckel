package Chapter7.Task2;


/*Exercise 2: (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called sterilize( ).*/

public class NewClass extends Deterent{

    void sterilize( ){};

    public void scrub() {
        append(" NewClass.NewClass ");
       // super.scrub(); // Call base-class version
    }

    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.scrub();
        System.out.println(nc);
    }
}
