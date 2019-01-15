package Chapter7.Task16;

/*Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate methods
in the base class. In main( ), create a Frog and upcast it to Amphibian and demonstrate that all the methods still work.*/

public class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.voice(frog);
        Amphibian.swim(frog); // Восходящее реобразование.
    }
}
