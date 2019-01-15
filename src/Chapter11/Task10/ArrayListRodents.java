package Chapter11.Task10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Exercise 10: Change Exercise 9 in the Polymorphism chapter to use an ArrayList to hold the Rodents and an Iterator to
 * move through the sequence of Rodents.
*/
public class ArrayListRodents {

    public static void main(String[] args) {

        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse(), new Hamster()};

       List<Rodent> arrRodents = new ArrayList<Rodent>();
        arrRodents.add(new Hamster());
        arrRodents.add(new Mouse());
        arrRodents.add(new Hamster());
        arrRodents.add(new Mouse());
        System.out.println(arrRodents.size());

        //Collections.addAll(arrRodents,rodents);
        Rodent rodent;

        Iterator rodIterator = arrRodents.iterator();

       while (rodIterator.hasNext()) {
           //System.out.println(  rodIterator.next());
           rodent = (Rodent) rodIterator.next();
           rodent.voice();
           rodent.run();
       }

    }
}
