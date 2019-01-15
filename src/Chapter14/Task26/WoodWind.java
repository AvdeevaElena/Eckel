package Chapter14.Task26;

class Woodwind extends Wind implements Playable {
   public  void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
    void clearSpitValve() {
        System.out.println("Woodwind clearing spit valve"); }
}