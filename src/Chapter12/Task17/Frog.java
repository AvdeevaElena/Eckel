package Chapter12.Task17;



/*Exercise 17
/* Modify pholymorphism/Frog.java so that it uses try-finally to
* guarantee proper cleanup, and show that this works even if you
* return from the middle of the try-finally.*/

public class Frog  extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");
    public Frog() {
        System.out.println("Frog()"); }
    public static void jump() {
        System.out.println("frog jumps"); }
    protected void dispose() {
        System.out.println("Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        try {
            frog.jump();
            System.out.println("Returning from try-finally");
            return;
        } finally {
            System.out.println("Bye!");
            frog.dispose();
        }
    }
}
