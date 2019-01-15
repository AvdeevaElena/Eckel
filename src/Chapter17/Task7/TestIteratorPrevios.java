package Chapter17.Task7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


/*Exercise 7
/* Create both an ArrayList and a LinkedList, and fill each using the
*  Countries.names() generator. Print each list using an ordinary
* iterator, then insert one list into the other by using a ListIterator,
* inserting at every other location. Now perform the insertion staring
* at the end of the first list and moving backwards.*/

public class TestIteratorPrevios {
    public static void main(String[] args) {


        List<String> llArr = new LinkedList<String>(Countries.names(25));
        ListIterator  it = llArr.listIterator();
        List<String> arArr = new ArrayList<String>(Countries.names(25));
        ListIterator it2 = arArr.listIterator();


        while(it.hasPrevious()) it.previous();
        while(it2.hasNext()) it2.next();
        while(it.hasNext()) {
            it2.add((String)it.next());
            it2.previous();
            it2.previous();
        }

        System.out.println(arArr);
    }
}
