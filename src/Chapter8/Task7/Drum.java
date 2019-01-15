package Chapter8.Task7;

public class Drum extends Instrument {

    void play(Note n) { System.out.println("Drum.play() " + n); }
    public String toString() { return "Drum"; }
    void adjust() { System.out.println("Adjusting Drum"); }
}
