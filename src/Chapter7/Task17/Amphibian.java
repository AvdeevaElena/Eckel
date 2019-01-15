package Chapter7.Task17;

public class Amphibian {

    void swim () {
        System.out.println( "SWIM");
    }
    void voice () {
        System.out.println( "B-b-b-buuul");
    }

    static void swim (Amphibian a) {
        a.swim();
    }
    static void voice (Amphibian a) {
        a.voice();
    }

}
