package Chapter14.Task26;

class Wind extends Instrument implements Playable {
    public void play(Note n) { System.out.println("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
    void clearSpitValve() {
        System.out.println("Wind clearing spit valve"); }
}
