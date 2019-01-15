package Chapter7.Task23;

/*Exercise 23: (2) Prove that class loading takes place only once. Prove that loading may be caused by either
 the creation of the first instance of that class or by the access of a static member.*/

public class Frog extends Amphibian {

    // void swim () {};

    void voice () {
        System.out.println( "B-b-b-buuul Frog");
    }



    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println(Frog.i);
        frog.count();



    }
}
