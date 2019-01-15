package Chapter10.Task9;

/*Create a private inner class that implements a public interface.
 * Write a method that returns a reference to an instance of the private inner class, upcast to the interface.
 * Show that the inner class is completely hidden by trying to downcast to it.*/

public class Animal {

    private class Bids implements Flayable{

        public void canFly() {System.out.println("I can fly");};

        Flayable returnAnimal() {
            return new Bids();
        }
    }

    public static void main(String[] args) {

    }

}
