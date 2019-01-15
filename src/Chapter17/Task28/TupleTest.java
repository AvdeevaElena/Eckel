package Chapter17.Task28;

/*Exercise 28
/* Modify net/mindview/util/Tuple.java to make it a
* general-purpose class by adding hashCode(), equals(),
* and implementing Comparable for each type of Tuple.*/


import java.util.*;

public class TupleTest {
    public static void main(String[] args) {
        Tuple t = new Tuple();
        FiveTuple t1b = t.tuple(1,1,1,1,1);
        FiveTuple t2b = t.tuple(1,1,1,2,1);
        FiveTuple t3b = t.tuple(1,1,1,1,1);
        FiveTuple t4b = t.tuple(1,1,1,1,0);
        System.out.println(t1b.compareTo(t1b));
        System.out.println(t1b.compareTo(t2b));
        System.out.println(t1b.compareTo(t3b));
        System.out.println(t1b.compareTo(t4b));
        List<FiveTuple> list = new ArrayList<FiveTuple>(Arrays.asList(t1b,t2b,t3b,t4b));
        Set<FiveTuple> s = new TreeSet<FiveTuple>();
        s.addAll(list);
        System.out.println(s);
    }
}
