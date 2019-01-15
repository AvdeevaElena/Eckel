package Chapter8.Task8;

/*Exercise 8: (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.*/

public class Music8 {
    private static RandomInstrumentsGenerator randGen = new RandomInstrumentsGenerator();

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

    public  static void randNext (Instrument [] e) {
        for (Instrument i: e) {
             i = randGen.next();
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind(),
        new Drum()};
        //tuneAll(orchestra);
        //printAll(orchestra);
        randNext(orchestra);

    }
    }

