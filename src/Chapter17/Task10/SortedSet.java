package Chapter17.Task10;

import java.util.Iterator;
import java.util.LinkedList;

public class SortedSet <E> extends LinkedList<E> {
    int compare(E e1, E e2) {
        int c = e1.hashCode() - e2.hashCode();
        return (c < 0) ? -1 : ((c == 0) ? 0 : 1);
    }

    public boolean add(E e) {
        if (!this.contains(e)) {
            Iterator<E> it = this.iterator();
            int index = 0;
            while (it.hasNext()) {
                if (compare(it.next(), e) < 1)
                    index++;
            }
            add(index, e);
            return true;
        }
        return false;
    }
}
