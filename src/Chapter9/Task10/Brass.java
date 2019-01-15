package Chapter9.Task10;

class Brass extends Wind implements Playable{
    public void play(Note n) { System.out.println("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { System.out.println("Adjusting Brass"); }
}