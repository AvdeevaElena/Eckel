package Chapter14.Task26;

class Stringed extends Instrument implements Playable {

    public void play(Note n) { System.out.println("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { System.out.println("Adjusting Stringed"); }
}