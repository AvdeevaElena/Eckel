package Chapter9.Task10;

/*Exercise 8: (2) In polymorphism.Sandwich.java, create an interface called FastFoo d (with appropriate methods) and
change Sandwic h so that it also implements FastFood.*/

public class Music8 {
    private static RandomInstrumentsGenerator randGen = new RandomInstrumentsGenerator();

    public static void tune( Playable i) {

        i.play(Note.B_FLAT);
        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHRP);
    }

        public static void tuneAll ( Playable [] e) {
            for(Playable i : e)
                tune(i);
        }

        public  static void printAll (Playable [] e) {
            for (Playable i: e)
                System.out.println(i);

        }

    public  static void randNext (Playable [] e) {
        for (Playable i: e) {
             i = randGen.next();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Playable [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
        new Drum()};
        //tuneAll(orchestra);
        //printAll(orchestra);
        randNext(orchestra);

    }
    }

