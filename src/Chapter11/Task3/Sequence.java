package Chapter11.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* Exercise 9: Modify innerclasses/Sequence.java so that you can add any number of elements to it.*/

public class Sequence {
    private List<Object> items;

    private Sequence(int size) {
        items = new ArrayList<>(size);
    }

    public Iterator interator() {
        return new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.size();
            }

            @Override
            public Object next() {
                return items.get(index++);
            }
        };
    }

    public static void main(String[] args) {

        Sequence seq = new Sequence(10);
        for (int i =0 ;i<10 ;i++) {
            seq.items.add(i);
        }

        Iterator iterator = seq.interator();
        while (iterator.hasNext()) {
           // iterator.next();
            System.out.print(iterator.next()+" ");
        }
    }
}
