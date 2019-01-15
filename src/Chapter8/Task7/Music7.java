package Chapter8.Task7;

/*Exercise 7: (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new type.*/

public class Music7 {
    public static void tune(Instrument i) {

        i.play(Note.B_FLAT);
        i.play(Note.MIDDLE_C);
        i.play(Note.C_SHRP);
    }

        public static void tuneAll ( Instrument [] e) {
            for(Instrument i : e)
                tune(i);
        }

        public  static void printAll (Instrument [] e) {
            for (Instrument i: e)
                System.out.println(i);

        }

    public static void main(String[] args) {

        Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
        new Drum()};
        //tuneAll(orchestra);
        printAll(orchestra);

    }
    }

