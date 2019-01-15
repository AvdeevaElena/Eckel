package Chapter14.Task26;

/*Exercise 8: (2) In polymorphism.Sandwich.java, create an interface called FastFoo d (with appropriate methods) and
change Sandwic h so that it also implements FastFood.*/

public class Music8 {
    public static void tune(Instrument i) {
        //...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    private static RandomInstrumentsGenerator gen = new RandomInstrumentsGenerator();
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = new Instrument[20];
        // fill up orchestra array wth instruments:
        for(int i = 0; i < orchestra.length; i++) {
            orchestra[i] = gen.next();
        }
        for(Instrument i : orchestra) {
            if(i instanceof Wind) // get RTTI
                ((Wind)i).clearSpitValve();
            i.adjust();
        }
        tuneAll(orchestra);
    }
    }

