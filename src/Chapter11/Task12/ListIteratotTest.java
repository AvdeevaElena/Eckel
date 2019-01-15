package Chapter11.Task12;

import java.util.ArrayList;
import java.util.ListIterator;

/* Exercise 12: Create and populate a List<Integer>. Create a second List<Integer> of the same size as the first, and
 * use ListIterators to read elements from the first List and insert them into the second in reverse order. (You may
 * want to explore a number of different ways to solve this problem.)*/

public class ListIteratotTest {

    public static void main(String[] args) {

        ArrayList<Integer> arrListFirst = new ArrayList<>();
        for (int i= 0; i<=20; i++) {
            arrListFirst.add(i);
        }
        for (Integer value: arrListFirst) {
            System.out.print(value+" ");
        }
        System.out.println("list iterator");
        ListIterator<Integer> it = arrListFirst.listIterator(arrListFirst.size());
        ArrayList<Integer> arrListSecod = new ArrayList<>(arrListFirst.size());

        System.out.println("arrListSecod");

         while (it.hasPrevious()) {
            arrListSecod.add(it.previous().intValue());

        }

        for (Integer value: arrListSecod) {
            System.out.print(value+" ");
        }
    }
}
