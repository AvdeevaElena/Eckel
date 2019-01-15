package Chapter7.Task21;

/*Exercise 21: (1) Create a class with a final method. Inherit from that class and attempt to overwrite that method..*/

public class Frog extends Amphibian {

    // void swim () {};

    void voice () {
        System.out.println( "B-b-b-buuul Frog");
    }



    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.swim();
        frog.voice();

    }
}
