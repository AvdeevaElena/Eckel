package Chapter11.Task1;

import java.util.ArrayList;
import java.util.Iterator;

/*Exercise 1: Create a new class called Gerbil with an int gerbilNumber that’s initialized in the constructor. Give it
 * a method called hop( ) that displays which gerbil number this is, and that it’s hopping. Create an ArrayList and add
 * Gerbil objects to the List. Now use the get( ) method to move through the List and call hop( ) for each Gerbil.*/

public class Gerbil {
    int grbilNumber;
    Gerbil(int grbilNumber) {
        this.grbilNumber = grbilNumber;
    }
        void hop() {
            System.out.println(grbilNumber+" ");
        }

    public static void main(String[] args) {

        ArrayList<Gerbil> arr = new ArrayList<Gerbil>(){};
        arr.add(new Gerbil(1));
        arr.add(new Gerbil(333));
        arr.add(new Gerbil(111));
        arr.add(new Gerbil(133));

       for (int i = 0;i<arr.size(); i++) {
           arr.get(i).hop();
        }

        System.out.println("Iterator");

        Iterator<Gerbil> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Gerbil g = iterator.next();
            g.hop();
        }

    }
}


