package Chapter11.Task2;

import java.util.HashSet;
import java.util.Set;

public class SimpleCollectionSet {
    public static void main(String[] args) {
        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i<10;i++) {
            sets.add(i);
        }
        for (Integer i: sets) {
            System.out.print( i+", ");
        }

    }
}
