package Chapter16.Task22;

import java.util.Arrays;

//Exercise 22: Show that the results of performing a binarySearch( ) on an unsorted array are unpredictable.

public class TestBinarySearch {

    public static void main(String[] args) {
        int[] intArr = {3, 2, 5, 4, 6};
        System.out.println(Arrays.binarySearch(intArr , 2));

    }
}
