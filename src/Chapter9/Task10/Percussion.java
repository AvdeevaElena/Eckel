package Chapter9.Task10;

class Percussion extends Instrument implements Playable {
    public void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}