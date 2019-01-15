package Chapter11.Task11;

import java.util.*;

/*
Exercise 11: Write a method that uses an Iterator to step through a Collection and print the toString( ) of each
 * object in the container. Fill all the different types of Collections with objects and apply your method to each
 * container
*/
public class IteratorToCollection {



    private static void goThrowCollection(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Rodent[] rodents = {new Mouse(), new Hamster(), new Mouse(), new Hamster()};

       List<Rodent>arrRodents  = new ArrayList<Rodent>();
        Collections.addAll(arrRodents,rodents);

        goThrowCollection(arrRodents.iterator());
        goThrowCollection(new LinkedList<>(arrRodents).iterator());
        goThrowCollection(new HashSet<>(arrRodents).iterator());
        goThrowCollection(new LinkedHashSet<>(arrRodents).iterator());


    }
}
