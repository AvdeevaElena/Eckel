package Chapter17.Task7;


/*Exercise 7
/* Create both an ArrayList and a LinkedList, and fill each using the
*  Countries.names() generator. Print each list using an ordinary
* iterator, then insert one list into the other by using a ListIterator,
* inserting at every other location. Now perform the insertion staring
* at the end of the first list and moving backwards.*/

import java.util.*;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> listArr = new ArrayList<String>(Countries.names());
        List<String> llArr = new LinkedList<String>(Countries.names());
       System.out.println(listArr);
        System.out.println(llArr);

        Iterator<String> iteratorA = listArr.iterator();
        Iterator<String> iteratorll = llArr.iterator();

        while (iteratorA.hasNext()) {
            System.out.print (iteratorA.next()+" ");
        }

        while (iteratorll.hasNext()) {
          System.out.print (iteratorll.next()+" ");
        }

        ListIterator listIteratorARR = listArr.listIterator();
        ListIterator listIteratorLL = llArr.listIterator();
       System.out.println(listIteratorARR.hasNext());

        while (listIteratorARR.hasNext()) {
            listIteratorLL.add((String)listIteratorARR.next() );
           listIteratorLL.next();
        }
        System.out.println(llArr);

    }

}
