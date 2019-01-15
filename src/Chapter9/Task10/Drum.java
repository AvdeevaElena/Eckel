package Chapter9.Task10;

public class Drum extends Instrument implements Playable{

    public void play(Note n) { System.out.println("Drum.play() " + n); }
    public String toString() { return "Drum"; }
    void adjust() { System.out.println("Adjusting Drum"); }
}
