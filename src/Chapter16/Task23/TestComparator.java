package Chapter16.Task23;

import java.util.Arrays;
import java.util.Comparator;

//Exercise 23:
//        (2) Create an array of Integer, fill it with random int values (using autoboxing), and sort it into
//        * reverse order using a Comparator.

public class TestComparator {
    public static void main(String[] args) {

        Integer[] intArr = new Integer[]{80,48,67,35,1,23};
        Arrays.sort(intArr , Comparator.reverseOrder());
        System.out.println(Arrays.toString(intArr ));

    }
}
