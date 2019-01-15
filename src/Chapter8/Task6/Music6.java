package Chapter8.Task6;

/*Exercise 6: (1) Change Music3.java so that what( ) becomes the root Object method toString( ).
Try printing the Instrument objects using System.out.println( ) (without any casting).Exercise 6:
 (1) Change Music3.java so that what( ) becomes the root Object method toString( ).
 Try printing the Instrument objects using System.out.println( ) (without any casting).*/

public class Music6 {
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

        Instrument [] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind()};
        //tuneAll(orchestra);
        printAll(orchestra);

    }
    }

