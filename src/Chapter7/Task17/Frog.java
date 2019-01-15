package Chapter7.Task17;

/*Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class (provides
new definitions using the same method signatures). Note what happens in main( ).*/

public class Frog extends Amphibian {

    void swim () {
        System.out.println( "SWIM Frog");
    }
    void voice () {
        System.out.println( "B-b-b-buuul Frog");
    }

    static void swim (Amphibian a) {
        a.swim();
    }
    static void voice (Amphibian a) {
        a.voice();
    }


    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.swim();
        frog.voice();

    }
}
