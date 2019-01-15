package Chapter7.Task24;

public class Beetle extends Insect{


    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println("Beetle constructor");
        System.out.println("k = " + k);
        System.out.println("j = " + j);

    }
    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {

        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }

}
