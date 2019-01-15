package Chapter17.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* Exercise 1, page 809
/* Create a List (try both ArrayList and LinkedList) and fill it using
* Countries. Sort the list and print it, then apply Collections.shuffle()
* to the list repeatedly, printing it each time so that you can see how
* the shuffle() method randomizes the list differently each time.*/

public class TestShuffle {
    public static void main(String[] args) {
        List<String> list =new LinkedList<String>();
        List<String> arrList =new ArrayList<String>();
        for(int i = 0; i < Countries.DATA.length; i++) {
            arrList.add(Countries.DATA[i][0]);
            list.add(Countries.DATA[i][1]);

            Collections.sort(list);
            Collections.sort(arrList);

            System.out.println(list);
            System.out.println(arrList);

            Collections.shuffle(list);
            Collections.shuffle(arrList);

            System.out.println(list);
            System.out.println(arrList);

            }

    }
}
