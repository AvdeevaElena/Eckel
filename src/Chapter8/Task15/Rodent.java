package Chapter8.Task15;

public class Rodent {

    static int ref=0;


    Rodent() {
        ++ref;
        System.out.println("BASE Rodent" + ref);
    };

    void voice () {
        System.out.println("I am Rodent");
    }

    void run () {
        System.out.println(" Rodent Run !!!");
    }

    public String toString() { return "Rodent"; }
}
