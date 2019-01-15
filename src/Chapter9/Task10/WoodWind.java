package Chapter9.Task10;

class Woodwind extends Wind implements Playable{
   public  void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}